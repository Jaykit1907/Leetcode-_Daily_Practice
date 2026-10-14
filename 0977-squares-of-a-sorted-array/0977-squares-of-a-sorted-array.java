class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[]=new int[nums.length];
        int start=0;
        int end=nums.length-1;
        int k=nums.length-1;
        while(start<=end){
            int digit1=nums[start]*nums[start];
            int digit2=nums[end]*nums[end];

            if(digit1>=digit2){
                ans[k]=digit1;
                k--;
                start++;
            }
            else{
                ans[k]=digit2;
                k--;
                end--;
            }
        }
        return ans;
    }
}