class Solution {
    public int passThePillow(int n, int time) {
        boolean flag=false;
        int count=1;
        while(time!=0){

            if(flag){
                count--;
                if(count==1){
                    flag=false;
                }
            }
            else{
                count++;
                if(count==n){
                    flag=true;
                }
            }
            time--;
        }
        return count;
    }
}