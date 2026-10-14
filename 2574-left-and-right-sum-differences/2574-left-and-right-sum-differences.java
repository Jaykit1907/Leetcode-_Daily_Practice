class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftsum[]=new int[nums.length];
        int rightsum[]=new int[nums.length];
        int ans[]=new int[nums.length];
        int left=0;
        for(int i=0;i<nums.length;i++){
                leftsum[i]=left;
                left=nums[i]+left;
        }
        int right=0;
        for(int i=nums.length-1;i>=0;i--){
            rightsum[i]=right;
            right=nums[i]+right;
           }
           for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(leftsum[i]-rightsum[i]);
           }

           return ans;
    }
}