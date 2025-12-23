public class BuyAndSell {
    public static int CalMaxProfit(int [] price){
        int n= price.length;
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<n;i++){
            if(buyPrice<price[i]){
                int profit=price[i]-buyPrice;
                maxProfit=Math.max(profit,maxProfit);
            }else{
                buyPrice=price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int [] StockPrice={7,1,5,3,6,4};
        System.out.println(CalMaxProfit(StockPrice));
    }
}
