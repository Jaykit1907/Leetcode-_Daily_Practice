class Solution {
    static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {

            int max=0;
            int start=0;
            int count=0;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(i<k){
                    if(isVowel(ch)){
                        count++;
                        max=Math.max(count,max);
                    }
                }
                else{
                    if(isVowel(s.charAt(start))){
                        count--;
                      
                    }
                    if(isVowel(ch)){
                        count++;
                        max=Math.max(count,max);
                    }
                      start++;
                }
            }

            return max;
    }
}