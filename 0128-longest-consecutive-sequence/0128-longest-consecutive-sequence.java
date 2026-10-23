class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int count=0;
        if(nums.length>=1){
            count=1;
        }
        int max=count;
        for(int val:set){

            if(!set.contains(val-1)){

                int curr=val;
                count=1;
                while(set.contains(curr+1)){
                    count++;
                    max=Math.max(count,max);
                    curr=curr+1;
                }
            }
        }
            return max;
    }
}