class Solution {
    public String removeDuplicates(String s) {
        
        StringBuilder sbr=new StringBuilder();
       

        for(int i=0;i<s.length();i++){
            if(sbr.length()==0){
                sbr.append(s.charAt(i));
            }
            else if(sbr.length()>0  && sbr.charAt(sbr.length()-1)!=s.charAt(i)){
                sbr.append(s.charAt(i));
            }
            else if(sbr.length()>0){
                sbr.deleteCharAt(sbr.length()-1);
            }
        }
        return sbr.toString();
    }
}