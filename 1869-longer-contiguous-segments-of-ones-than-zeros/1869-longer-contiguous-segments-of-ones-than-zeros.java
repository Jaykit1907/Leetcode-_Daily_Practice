class Solution {
    public boolean checkZeroOnes(String s) {
        int one=0;
        int zero=0;
        int onemax=0;
        int zeromax=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                one++;
                zero=0;
            }
            else{
                zero++;
                one=0;
            }
            onemax=Math.max(onemax,one);
            zeromax=Math.max(zeromax,zero);
        }

        return onemax>zeromax;
    }
}