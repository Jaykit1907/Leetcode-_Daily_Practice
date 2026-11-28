class Solution {
    public int longestPalindrome(String s) {
        int freq[]=new int[128];
        for(int i=0;i<s.length();i++){
          freq[s.charAt(i)]++;
        }
        int count=0;
        for(int i=0;i<128;i++){
                if(freq[i]%2==0){
                    count+=freq[i];
                }
                else if(freq[i]>1){
                    count+=freq[i]-1;
                }
        }
        return count!=s.length()?count+1:count;
    }
}