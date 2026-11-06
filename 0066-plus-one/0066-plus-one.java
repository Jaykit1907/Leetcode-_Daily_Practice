class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length-1;
       
       while(n>=0 ){
                if(digits[n]<9){
                    digits[n]=digits[n]+1;
                    return digits;
                }
                digits[n]=0;
                n--;

       }

       int ans[]=new int[digits.length+1];
       ans[0]=1;

       return ans;
    }
}