class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
    int start=0;
        for(int i=0;i<nums.length;i++){
        int val=nums[i];
        map.put(val,map.getOrDefault(val,0)+1);
        while(map.get(val)>k){
            map.put(nums[start],map.get(nums[start])-1);
            start++;
        }
        max=Math.max(i-start+1,max);

        }
        return max;
    }
}