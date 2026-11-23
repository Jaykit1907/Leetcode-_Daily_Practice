class Solution {
      static int max=0;
       static String val="";
       static void isPalindrome(String s,int left,int right){
        
        while(left>=0 && right<s.length() && (s.charAt(left)==s.charAt(right))){
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
        
        val="";
        max=0;
        for(int i=0;i<s.length();i++){
            isPalindrome(s,i,i);
            isPalindrome(s,i,i+1);
        }
        return val;
    }
}