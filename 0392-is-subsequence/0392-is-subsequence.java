class Solution {
    public boolean isSubsequence(String s, String t) {
      int start=0;
     for(int i=0;i<t.length();i++){
        if(start>=s.length()){
            break;
        }
        if(s.charAt(start)==t.charAt(i)){
            start++;
        }
     }
     return start>=s.length();
    
    }
}