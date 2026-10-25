class Solution {
    public String kthDistinct(String[] arr, int k) {
        // HashMap<String,Integer> map=new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        // }
        // int count=0;
        // for(int i=0;i<arr.length;i++){
        //     int val=map.get(arr[i]);
        //     if(val==1){
        //         count++;
        //     }
        //     if(count==k){
        //         return arr[i];
        //     }
        // }
        // return "";

        HashMap<String,Integer> map=new HashMap<>();
        HashMap<String,Integer> index=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
                index.put(arr[i],i);
            }
        }
        PriorityQueue<String> pq=new PriorityQueue<>((a,b)->{
          
            return index.get(a)-index.get(b);
    });
    for(String key:map.keySet()){
        if(map.get(key)==1){
            pq.add(key);
        }
    }
        int count=0;
        while(pq.size()>0){
            count++;
         
            if(count==k){
                return pq.peek();
            }
               pq.poll();
        }
        return "";
    }
}