class Solution {
    public double findMaxAverage(int[] nums, int k) {
int sum=0;
    for(int i=0;i<k;i++){
        sum+=nums[i];
            }
    double val=k;
    double avg=sum/k;
    int max=Integer.MIN_VALUE;
    max=sum;
    int start=0;
    for(int i=k;i<nums.length;i++){
        sum=sum-nums[start];
        start++;
        sum+=nums[i];
        max=Math.max(sum,max);
    }
    return max/val;
    }
}