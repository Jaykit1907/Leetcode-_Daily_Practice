class Solution {
    public int buyChoco(int[] prices, int money) {
        int firstmin=Integer.MAX_VALUE;
        int secondmin=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<firstmin){
                secondmin=firstmin;
                firstmin=prices[i];
            }
            else if(prices[i]<secondmin){
                secondmin=prices[i];
            }
        }

        int sum=firstmin+secondmin;
        if(money-sum<0){
            return money;
        }
        else{
            return money-sum;
        }
    }
}