class Solution {
    public boolean canAliceWin(int n) {

        int count=10;
        boolean flag=false;
        while(n>=count && count>0){
            n=n-count;
            count--;
            flag=!flag;
        }


        return n>=count || flag;
    }
}