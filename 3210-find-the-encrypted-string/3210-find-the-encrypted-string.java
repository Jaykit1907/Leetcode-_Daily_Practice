class Solution {
    public String getEncryptedString(String s, int k) {
        StringBuilder sbr=new StringBuilder();
        for(int i=0;i<s.length();i++){
                int sum=k+i;

                sbr.append(s.charAt(sum%s.length()));


                                }

     return sbr.toString();
    }
}