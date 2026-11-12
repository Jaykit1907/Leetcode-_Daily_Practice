class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int rem=0;
        if(x<0){
            return false;
        }
        while(temp!=0){
            rem=rem*10+(temp%10);
            temp=temp/10;
        }

        return x==rem;
    }
}