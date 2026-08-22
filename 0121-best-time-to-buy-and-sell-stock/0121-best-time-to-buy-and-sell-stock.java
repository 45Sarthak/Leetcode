class Solution {
    public int maxProfit(int[] prices) {
      int byPrice=Integer.MAX_VALUE;
      int maxprofit=0;

    for(int i=0;i<prices.length;i++){
      if(byPrice<prices[i]){
        int profit = prices[i]-byPrice;
        maxprofit=Math.max(maxprofit,profit);
      }

      else{
        byPrice=prices[i];
      }
    }
    return maxprofit;
    }

}