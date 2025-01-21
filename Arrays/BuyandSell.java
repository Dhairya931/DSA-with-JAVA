package Arrays;

public class BuyandSell {
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int max_profit = 0;
        int profit = 0;
        for(int i = 1; i < prices.length; i++ ){
            if(buy > prices[i]){
                buy = prices[i];
            }
            else{
                profit = prices[i] - buy;
            }
            if(profit > max_profit){
                max_profit = profit;
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int res= maxProfit(prices);
        System.out.println(res);
    }
}





