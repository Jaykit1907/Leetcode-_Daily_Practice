class Solution {
    public boolean isPerfectSquare(int num) {

        int start=1;
        int end=num;
        while(start<=end){
            long mid=(start+end)/2;

            long sq=mid*mid;
            if(num==(int)(sq)){
                return true;
            }
            else if(sq>num){
                end=(int)mid-1;
            }
            else{
                start=(int)mid+1;
            }
        }
        return false;
        
    }
}