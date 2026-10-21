class Solution {
    static void reverse(char ch[],int start,int end){
        
        while(start<end){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        }
    public String reverseStr(String s, int k) {
        
        char ch[]=s.toCharArray();
        int i=0;
        while(i<ch.length){

            
            if(i+k-1<ch.length){
                reverse(ch,i,i+k-1);
            }
            else{
                reverse(ch,i,ch.length-1);
            }
          
                i=i+2*k;
            

        }  

        return String.valueOf(ch);     
    }
}