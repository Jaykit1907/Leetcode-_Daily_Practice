class Solution {
    
    public String breakPalindrome(String palindrome) {

        if(palindrome.length()==1){
            return "";
        }
        StringBuilder sbr=new StringBuilder(palindrome);
        for(int i=0;i<palindrome.length()/2;i++){
           if(sbr.charAt(i)!='a'){
            sbr.setCharAt(i,'a');
            return sbr.toString();
        
           }
        }
        sbr.setCharAt(sbr.length()-1,'b');
        return sbr.toString();
    }
}