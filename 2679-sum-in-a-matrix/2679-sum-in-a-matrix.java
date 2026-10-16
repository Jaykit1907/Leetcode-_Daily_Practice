class Solution {
    static int findmax(int nums[][]){


       int c=-1;
        int row=-1;
        int col=-1;
        int totalmax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
             int max=Integer.MIN_VALUE;
            for(int j=0;j<nums[0].length;j++){

                    if(nums[i][j]>max){
                        row=i;
                        col=j;
                        max=nums[i][j];
                    }
            }
            nums[row][col]=-1;
            totalmax=Math.max(max,totalmax);
        }
    
        return totalmax;

    }
    public int matrixSum(int[][] nums) {
        int score=0;
        for(int i=0;i<nums[0].length;i++){
                score+=findmax(nums);
        }
        return score;
    }
}