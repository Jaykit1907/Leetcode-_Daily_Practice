class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        double max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double val=k;
        double avg=sum/val;
        max=Math.max(max,avg);
        int start=0;
        for(int i=k;i<nums.length;i++){
            sum-=nums[start];
            sum+=nums[i];
            start++;
                avg=sum/val;
                max=Math.max(avg,max);

        }
        return max;
    }
}