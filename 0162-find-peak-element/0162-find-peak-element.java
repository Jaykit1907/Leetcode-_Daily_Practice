class Solution {
    public int findPeakElement(int[] nums) {
        int start=1;
        int end=nums.length-2;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        if(nums[0]<nums[nums.length-1]){
            return nums.length-1;
        }
        else{
            return 0;
        }
        
    }
}