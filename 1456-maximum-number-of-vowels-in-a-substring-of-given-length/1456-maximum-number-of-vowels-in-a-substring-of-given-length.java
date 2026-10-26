class Solution {
    static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int max=Integer.MIN_VALUE;
        int start=0;
        int count=0;
        for(int i=0;i<s.length();i++){
           if(i<k){
            if(isVowel(s.charAt(i))){
                count++;
                max=Math.max(max,count);
            }
           }
           else {
            if(isVowel(s.charAt(start))){
                count--;
            }
            if(isVowel(s.charAt(i))){
                count++;
                max=Math.max(count,max);
            }
            start++;
           }
        }
        return max==Integer.MIN_VALUE?0:max;
    }
}