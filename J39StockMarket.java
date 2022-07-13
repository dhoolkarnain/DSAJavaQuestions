public class J39StockMarket {
    static int maxProfit(int[] a) {
        int maxProfit = 0;
        int minSoFar = a[0];
        for (int i = 0; i < a.length; i++) {
            minSoFar = Math.min(minSoFar, a[i]);
            int Profit = a[i] - minSoFar;
            maxProfit = Math.max(maxProfit, Profit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] a = { 5, 2, 6, 1, 4 };
        System.out.println(maxProfit(a));
        ;
    }
}
