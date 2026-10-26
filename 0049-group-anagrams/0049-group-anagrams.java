class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map=new HashMap<>();
        
        for(int i=0;i<strs.length;i++){

            char st[]=strs[i].toCharArray();
            Arrays.sort(st);
            String s1=String.valueOf(st);
            if(!map.containsKey(s1)){
               map.put(s1,new ArrayList<>());
            }

                  map.get(s1).add(strs[i]);


        }
            return new ArrayList<>(map.values());
    }
}