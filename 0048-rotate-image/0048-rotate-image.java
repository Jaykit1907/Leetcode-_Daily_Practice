class Solution {

    static void rotate(int matrix[]){
        int end=matrix.length-1;
        int start=0;
        while(start<end){
            int temp=matrix[start];
            matrix[start]=matrix[end];
            matrix[end]=temp;
            start++;
            end--;
        }

    }

    public void transpose(int matrix[][]){
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public void rotate(int[][] matrix) {

        transpose(matrix);

        for(int i=0;i<matrix.length;i++){
            rotate(matrix[i]);

        }

        
    }
}