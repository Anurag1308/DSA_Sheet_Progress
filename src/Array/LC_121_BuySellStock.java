package Array;

public class LC_121_BuySellStock {
    public static void main(String[] args) {
        int[] stockPrice = {7, 1, 5, 3, 6, 4};
        int ans = maxProfit(stockPrice);
        System.out.println("the max profit can be : "+ans);
    }
    public static int maxProfit(int[] prices){
        int i = 0;
        int j = 1;
        int max = 0;

        while(j < prices.length){
            if(prices[j] < prices[i]){
                i = j;
                j++;
                continue;
            }
            if(max < (prices[j] - prices[i])){
                max = prices[j] - prices[i];

            }
            j++;
        }
        return max;
    }
}
