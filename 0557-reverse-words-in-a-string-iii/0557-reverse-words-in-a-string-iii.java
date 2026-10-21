class Solution {

    static void reverse(char str[],int start,int end){
        while(start<end){
            char temp=str[start];
            str[start]=str[end];
            str[end]=temp;
            start++;
            end--;
        }
    }
    public String reverseWords(String s) {
        

        char ch[]=s.toCharArray();
        int right=0;
        int prev=0;
        while(right<ch.length){
            if(right==ch.length-1){
                reverse(ch,prev,right);
            }
            if(ch[right]==' '){
                reverse(ch,prev,right-1);
                prev=right+1;
                right++;
            }
           else{
            right++;
           }
        }

        return String.valueOf(ch);
    }
}