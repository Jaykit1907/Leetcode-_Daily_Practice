class Solution {
    static String val="";
    static int max=0;
    static void isPalindrome(String s,int start,int end){

        while(start>=0 && end<s.length() && (s.charAt(start)==s.charAt(end))){
            start--;
            end++;
        }
        int size=end-start+1;
        if(size>max){
            val=s.substring(start+1,end);
            max=size;
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