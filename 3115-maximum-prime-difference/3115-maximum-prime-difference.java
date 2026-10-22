class Solution {

    static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int maximumPrimeDifference(int[] nums) {


        int first=0;
        boolean flag=true;
        int end=0;
        for(int i=0;i<nums.length;i++){

            if(flag){
                if(isPrime(nums[i])){
                    first=i;
                    end=i;
                    flag=false;
                }
            }
            else if(isPrime(nums[i])){
                    end=i;
            }


        }
        return end-first;
    }
}