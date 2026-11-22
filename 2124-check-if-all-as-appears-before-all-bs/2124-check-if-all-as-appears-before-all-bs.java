class Solution {
    public boolean checkString(String s) {
           
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' && flag){

            }
            else{
                flag=false;
                if(s.charAt(i)!='b'){
                    return false;
                }
            }
        }
        return true;
    }
}