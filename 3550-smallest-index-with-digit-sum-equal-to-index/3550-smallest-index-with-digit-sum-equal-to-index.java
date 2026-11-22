class Solution {
    public int smallestIndex(int[] nums) {
        
       
        for(int i=0;i<nums.length;i++){
             int rem=0;
            while(nums[i]!=0){
                rem=rem+nums[i]%10;
                nums[i]=nums[i]/10;
            }
            if(rem==i){
                return i;
            }
        }
        return -1;
    }
}