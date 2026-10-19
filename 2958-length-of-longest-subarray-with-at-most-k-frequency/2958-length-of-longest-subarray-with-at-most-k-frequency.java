class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int start=0;
        int end=0;

        while(end<nums.length){
            int val=nums[end];
            map.put(val,map.getOrDefault(val,0)+1);
            while(map.get(val)>k){
                map.put(nums[start],map.get(nums[start])-1);
                start++;
            }

            int size=end-start+1;
            max=Math.max(size,max);
            end++;
        }
        
        return max;
    }
}