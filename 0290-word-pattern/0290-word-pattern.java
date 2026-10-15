class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        String st[]=s.split(" ");
        if(st.length!=pattern.length()){
            return false;
        }
        for(int i=0;i<st.length;i++){
            char ch=pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(st[i])){
                    return false;
                }
            }
            else{
                if(map.containsValue(st[i])){
                    return false;
                }
                else{
                    map.put(ch,st[i]);
                }
            }
        }
        return true;
        
    }
}