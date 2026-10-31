class Solution {
    public boolean repeatedSubstringPattern(String s) {


        String doublest=s+s;
        String newString=doublest.substring(1,doublest.length()-1);

        return newString.contains(s);
        
    }
}