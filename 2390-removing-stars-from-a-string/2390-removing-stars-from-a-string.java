class Solution {
    public String removeStars(String s) {
        StringBuilder sbr=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(sbr.length()>0 && ch=='*'){
                sbr.deleteCharAt(sbr.length()-1);
            }
            else{
                sbr.append(ch);
            }
        }

        return sbr.toString();
    }
}