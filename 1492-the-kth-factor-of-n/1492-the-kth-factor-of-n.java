class Solution {
    public int kthFactor(int n, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=1;i<=n;i++){
            if(n%i==0){
                pq.add(i);
                
            }
            if(pq.size()==k){
                return pq.poll();
            }
        }
        return -1;
    }
}