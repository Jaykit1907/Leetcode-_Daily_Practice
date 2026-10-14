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
        int start=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        max=Math.max(count,max);
        for(int i=k;i<s.length();i++){
            
            if(isVowel(s.charAt(start))){
                count--;
            }
            if(isVowel(s.charAt(i))){
                count++;
            }
            start++;
            max=Math.max(max,count);

        }
        return max;

    }
}