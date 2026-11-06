class Solution {
    public int maxPower(String s) {
        int max=Integer.MIN_VALUE;
        int start=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(start)==s.charAt(i)){
                max=Math.max(i-start+1,max);
            }
            while(s.charAt(start)!=s.charAt(i) && start<i){
                start++;
                 max=Math.max(i-start+1,max);
            }
        }
        return max;
    }
}