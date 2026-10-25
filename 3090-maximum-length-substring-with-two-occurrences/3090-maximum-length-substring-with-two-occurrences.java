class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                    map.put(s.charAt(start),map.get(s.charAt(start))-1);
                    start++;
            }
            max=Math.max(i-start+1,max);
        }
        return max;
    }
}