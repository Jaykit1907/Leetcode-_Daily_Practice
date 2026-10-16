class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        List<String> list=new ArrayList<>();

        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
       PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if (!map.get(a).equals(map.get(b))) {
                return map.get(b) - map.get(a);
            }
            return a.compareTo(b);
        });
        pq.addAll(map.keySet()); 
        for(int i=0;i<k;i++){
            list.add(pq.poll());
        }
return list;

    }
}