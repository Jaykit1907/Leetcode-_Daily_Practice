class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }

            if (min > nums[i]) {
                min = nums[i];
            }
        }

        long count1 = 0;

        for (int i = 0; i < nums.length; i++) {
            count1 += (long) nums[i] - min;
        }

        return (int) count1;
    }
}