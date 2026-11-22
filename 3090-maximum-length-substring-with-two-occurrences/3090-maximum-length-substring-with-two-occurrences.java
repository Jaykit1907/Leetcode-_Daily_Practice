class Solution {
    public int maximumLengthSubstring(String s) {
        
        int freq[]=new int[26];
        int start=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']+=1;
            while(freq[ch-'a']>2){
                freq[s.charAt(start)-'a']-=1;
                start++;
            }
            max=Math.max(i-start+1,max);
        }
        return max;
    }
}