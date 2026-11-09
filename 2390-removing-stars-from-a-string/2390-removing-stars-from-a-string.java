class Solution {
    public String removeStars(String s) {
        StringBuilder sbr=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*' && sbr.length()>0){
                sbr.deleteCharAt(sbr.length()-1);
            }
            else if(s.charAt(i)!='*'){
                sbr.append(s.charAt(i));
            }
        }
        return sbr.toString();
    }
}