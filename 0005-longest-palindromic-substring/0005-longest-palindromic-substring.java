class Solution {
    static int max=0;
    static String val="";

    static void isPalindrome(int left,int right,String s)
    {
        while(left>=0 && right<=s.length()-1 && (s.charAt(left)==s.charAt(right))){
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
            isPalindrome(i,i+1,s);
            isPalindrome(i,i,s);
        }
        return val;
    }
}