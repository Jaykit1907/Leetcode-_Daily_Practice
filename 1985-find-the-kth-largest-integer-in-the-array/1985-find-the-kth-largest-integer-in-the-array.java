class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> pq=new PriorityQueue<>((a,b)->{
            if(a.length()!=b.length()){
                return a.length()-b.length();
            }
            return a.compareTo(b);
        });
        for(int i=0;i<nums.length;i++){

            if(pq.size()<k){
                pq.add(nums[i]);
            }
            else{
                if (nums[i].length() > pq.peek().length() ||
    (nums[i].length() == pq.peek().length()
        && nums[i].compareTo(pq.peek()) > 0)) {
    pq.poll();
    pq.add(nums[i]);
}
            }
        }

        return pq.peek();
        
    }
}