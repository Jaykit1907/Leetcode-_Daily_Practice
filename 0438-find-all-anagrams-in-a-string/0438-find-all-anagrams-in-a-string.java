class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int pt[]=new int[26];
        int st[]=new int[26];
        List<Integer> list=new ArrayList<>();
        // for(int i=0;i<s.length();i++){
        //     st[s.charAt(i)-'a']+=1;
        // }
        for(int i=0;i<p.length();i++){
            pt[p.charAt(i)-'a']+=1;
        }
        int start=0;
        for(int i=0;i<s.length();i++){
            if(i<p.length()){
                    st[s.charAt(i)-'a']+=1;
            }
            else{
                if(Arrays.equals(pt,st)){
                    list.add(start);
                }
                st[s.charAt(i)-'a']+=1;
                st[s.charAt(start)-'a']-=1;
                start++;
            }
        }
        if(Arrays.equals(pt,st)){
            list.add(start);
        }
        return list;
    }
}