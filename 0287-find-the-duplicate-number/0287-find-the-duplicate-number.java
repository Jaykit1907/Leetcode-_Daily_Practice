class Solution {
    public int findDuplicate(int[] nums) {
        
        while(true){
            int val=nums[0];
            if(nums[val]==nums[0]){
                return val;
            }
            int temp=nums[val];
            nums[val]=nums[0];
            nums[0]=temp;
            
        }
       
    }
}