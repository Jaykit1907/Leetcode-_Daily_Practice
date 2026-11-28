class Solution {
    public int longestPalindrome(String s) {
        int freq[]=new int[128];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        int count=0;
        boolean flag=false;
        for(int i=0;i<128;i++){

            int val=freq[i];
            count=count+(val/2)*2;
            if(val%2==1){
                flag=true;
            }

        }
return flag?count+1:count;
    }
}