class Solution {
    public int maxProduct(int[] nums) {
        int left=1;
        int right=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            left=nums[i]*left==0?1:left;
            right=nums[nums.length-1-i]*right==0?1:right;
            left=left*nums[i];
            right=right*nums[nums.length-1-i];
            max=Math.max(max,Math.max(left,right));
        }
        return max;
    }
}