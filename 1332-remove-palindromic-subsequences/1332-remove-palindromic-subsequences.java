class Solution {
    public int removePalindromeSub(String s) {
        
        if(s.length()==0){
            return 0;

        }

        StringBuilder sbr=new StringBuilder(s);
        if(s.equals(sbr.reverse().toString())){
            return 1;
        }
        return 2;
    }
}