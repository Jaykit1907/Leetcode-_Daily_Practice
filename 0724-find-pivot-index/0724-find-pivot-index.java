class Solution {
    public int pivotIndex(int[] nums) {

        int left=0;
        int sum=0;
    for(int i=0;i<nums.length;i++){
        sum+=nums[i];
    }
    int right=0;
    for(int i=0;i<nums.length;i++){
      
        right=sum-nums[i]-left;
        if(right==left){
            return i;
        }
        left=left+nums[i];
    }
return -1;
    }
}