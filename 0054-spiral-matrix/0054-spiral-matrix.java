class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int startrow=0;
        int startcol=0;
        int endcol=matrix[0].length-1;
        int endrow=matrix.length-1;
        while(startrow<=endrow && startcol<=endcol){

                if(startrow<=endrow){
                    for(int i=startcol;i<=endcol;i++){
                        list.add(matrix[startrow][i]);
                    }
                    startrow++;
                }

                if(startcol<=endcol){
                    for(int i=startrow;i<=endrow;i++){
                        list.add(matrix[i][endcol]);
                    }
                    endcol--;
                }

                if(startrow<=endrow){
                    for(int i=endcol;i>=startcol;i--){
                        list.add(matrix[endrow][i]);
                    }
                    endrow--;
                }

                if(startcol<=endcol){
                    for(int i=endrow;i>=startrow;i--){
                        list.add(matrix[i][startcol]);
                    }
                    startcol++;
                }
        }

        return list;
    }
}