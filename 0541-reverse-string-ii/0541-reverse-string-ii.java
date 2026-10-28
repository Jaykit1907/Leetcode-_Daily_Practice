class Solution {
    static void reverse(char[] ch,int start,int end){
        while(start<end){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
    }
    public String reverseStr(String s, int k) {
        
            char st[]=s.toCharArray();
            int start=0;
           
         
            while(start<s.length()){

                    if(start+k-1<s.length()){
                    reverse(st,start,start+k-1);
                    }
                    else{
                        reverse(st,start,s.length()-1);
                    }
                    start+=k*2;
                    
              
            }
               
            return String.valueOf(st);
            }
}