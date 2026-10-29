class Solution {
    public int[][] generateMatrix(int n) {
        int count=1;
        int mat[][]=new int[n][n];
        int rowstart=0;
        int rowend=n-1;
        int colstart=0;
        int colend=n-1;
        while(rowstart<=rowend && colstart<=colend){
            if(rowstart<=rowend){
                for(int i=colstart;i<=colend;i++){
                    mat[rowstart][i]=count;
                    count++;
                    
                }
                rowstart++;
            }
            if(colstart<colend){
                for(int i=rowstart;i<=rowend;i++){
                    mat[i][colend]=count;
                    count++;
                }
                colend--;
            }
            if(rowstart<=rowend){
                for(int i=colend;i>=colstart;i--){
                    mat[rowend][i]=count;
                    count++;
                }
                rowend--;
            }
            if(colstart<=colend){
                for(int i=rowend;i>=rowstart;i--){
                    mat[i][colstart]=count;
                    count++;
                }
                colstart++;
            }
        }
        return mat;
    }
}