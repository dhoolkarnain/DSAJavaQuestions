public class J43SelectionSort {
    public static void main(String[] args) {
        int[] a = { 4, 1, 9, 2, 3, 6 };
        int n = a.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            int min = a[i];
            for (int j = i; j < n; j++) {
                if (a[j] <= min) {
                    min = a[j];
                    index = j;
                }
            }
            int temp = min;
            a[index] = a[i];
            a[i] = temp;
        }
        for (int j = 0; j < n; j++) {
            System.out.print(a[j] + " ");

        }
    }
}
