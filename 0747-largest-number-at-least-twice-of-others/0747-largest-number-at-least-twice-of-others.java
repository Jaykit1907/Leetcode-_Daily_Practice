class Solution {
    public int dominantIndex(int[] nums) {

            int max=Integer.MIN_VALUE;
            int smax=Integer.MIN_VALUE;
            int idx=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>=max){
                    smax=max;
                    max=nums[i];
                    idx=i;
                }
                else if(nums[i]>smax && nums[i]!=max){
                    smax=nums[i];
                }
            }

            return 2*smax<=max?idx:-1;
    }
}