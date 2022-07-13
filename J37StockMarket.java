public class J37StockMarket {
    public static void main(String[] args) {
        int[] a = { 3, 5, 1, 7, 4, 9, 3 };
        int maxProfit = 0;
        int minShare = a[0];
        int buy = 0, sell = 0;

        for (int j = 0; j < a.length; j++) {
            if (minShare > a[j]) {
                minShare = a[j];
                buy = j + 1;
            }
            if (maxProfit < (a[j] - minShare)) {
                maxProfit = a[j] - minShare;
                sell = j + 1;
            }
        }
        System.out.println("Maximum Profit " + maxProfit + " if you buy stock at " + buy + " index and sell at " + sell
                + " index.");

    }
}
