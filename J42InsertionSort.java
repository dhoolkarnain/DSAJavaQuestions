public class J42InsertionSort {
    public static void main(String[] args) {
        int[] a = { 4, 3, 7, 1, 5 };
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int temp = a[i];

            // for (int j = i - 1; j > 0 && a[j] > temp; j--) {
            // a[j + 1] = a[j];
            // }
            int j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
            // for (int k = 0; k < n; k++) {
            // System.out.print(a[k] + " ");
            // }
            // System.out.println(" ");
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
