class Solution {
    static int max=0;
    static String val="";

    static void isPalindrome(String s,int left,int right){

                while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                        left--;
                        right++;
                }

                int size=right-left;
                if(size>max){
                 
                    val=s.substring(left+1,right);
                       max=size;
                }

    }
    public String longestPalindrome(String s) {
        max=0;
        val="";

        for(int i=0;i<s.length();i++){
                isPalindrome(s,i,i);
                isPalindrome(s,i,i+1);
        }
        return val;
        
    }
}