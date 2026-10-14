class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans[]=new int[k];
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            map.put(val,map.getOrDefault(val,0)+1);
        }

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        for(int i=0;i<k;i++){
            ans[i]=pq.poll();
        }
        return ans;
 }
}