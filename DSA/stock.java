public class stock {
    public static int bestTimeToBuyAndSellStock(int []prices) {
        // Write your code here.
        int minPrice= Integer.MAX_VALUE;
        int maxpro=0;
        for(int i=0;i<prices.length;i++){
            if(minPrice>prices[i]){
                minPrice=prices[i];
            }
            else if(prices[i]-minPrice>maxpro){
                maxpro=prices[i]-minPrice;
            }
        }
        return maxpro;
    }
}
