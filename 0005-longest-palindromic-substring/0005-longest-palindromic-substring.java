class Solution {
    static String val="";
    static int max=0;
    static void palindrome(String s,int left,int right){
            int count=0;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }
            int size=right-left+1;
            if(size>max){
                max=size;
                val=s.substring(left+1,right);
            }

    }
    public String longestPalindrome(String s) {
            max=0;
            val="";
     
        for(int i=0;i<s.length();i++){
            palindrome(s,i,i);
            palindrome(s,i,i+1);
        }

        return val;
    }
}