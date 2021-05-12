package Other;

/**
 * 假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 */
public class Code_63 {
    //暴力破解，循环找答案， 官方解法 只需要一次遍历，把最小值存下来，然后找利润比最小值大的。
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for(int i =0;i<prices.length;i++){
            for(int j = i;j<prices.length;j++){
                if(prices[j]-prices[i] > maxprofit)
                    maxprofit = prices[j]-prices[i];
            }
        }
        return maxprofit;

    }
}
