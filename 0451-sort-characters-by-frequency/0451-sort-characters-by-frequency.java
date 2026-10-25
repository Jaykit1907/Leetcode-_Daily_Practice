class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->{
            return map.get(b)-map.get(a);
        });
        StringBuilder sbr=new StringBuilder();
        pq.addAll(map.keySet());
        while(pq.size()>0){
            for(int i=0;i<map.get(pq.peek());i++){
                sbr.append(pq.peek());
            }
            pq.poll();
        }
        return sbr.toString();
    }
}