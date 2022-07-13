public class J38StockMarket {
    public static void main(String[] args) {
        // int[] a = { 3, 1, 4, 8, 7, 2, 5 };
        int[] a = { 3, 5, 1, 7, 4, 9, 3 };

        int n = a.length;
        int[] aux = new int[n];
        int max = a[n - 1];

        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > max) {
                max = a[i];
                aux[i] = max;
            } else {
                aux[i] = max;
            }
        }
        int maxProfit = aux[0] - a[0];
        for (int i = 0; i < n; i++) {
            if (maxProfit < (aux[i] - a[i])) {
                maxProfit = aux[i] - a[i];
            }
        }

        System.out.println(maxProfit);
    }
}
