class Solution {
    static void rotate(int nums[],int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        
        int end=nums.length;
        k=k%end;
        rotate(nums,0,end-1);
        rotate(nums,0,k-1);
        rotate(nums,k,end-1);
    }
}