class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        HashMap<String,Integer> index=new HashMap<>();
        List<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])){
                map.put(words[i],map.get(words[i])+1);
            }
            else{
                map.put(words[i],1);
                index.put(words[i],i);
        }
        }
        PriorityQueue<String> pq=new PriorityQueue<>((a,b)->{
            if(!map.get(a).equals(map.get(b))){
                return map.get(b)-map.get(a);
            }
            return a.compareTo(b);
        });
        pq.addAll(map.keySet());
        while(pq.size()>0){
            if(k>0){
                list.add(pq.poll());
                k--;
            }
            else{
                break;
            }
        }
        return list;
    }
}