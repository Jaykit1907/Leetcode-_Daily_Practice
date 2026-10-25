class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int val=97-ch+26;
                    sum+=val*(i+1);

                    }
                    return sum;
    }
}