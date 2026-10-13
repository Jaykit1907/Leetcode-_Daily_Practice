class Solution {
    static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int count=0;
        int max=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
           
            max=Math.max(max,count);
        }
        int start=0;
        for(int end=k;end<s.length();end++){
            
            if(isVowel(s.charAt(start))){
                count--;
            }
            if(isVowel(s.charAt(end))){
                count++;
            }
            max=Math.max(count,max);
            start++;
        }
        return max;
    }
}