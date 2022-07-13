public class J41BubbleSort {
    // static void swap(int a, int b){
    // a=a^b;
    // b=a^b;
    // a=a^b;
    // }
    public static void main(String[] args) {
        int[] a = { 4, 3, 7, 1, 5 };
        int n = a.length;
        for (int j = 0; j < n - 1; j++) {
            boolean swapped = false;
            for (int i = 0; i < n - j - 1; i++) {
                if (a[i + 1] < a[i]) {
                    swapped = true;
                    // swap(a[i], a[i - 1]);
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;

                }
            }
            if (!swapped) {
                break;
            }
        }
        // for (int j = 0; j < n; j++) {
        // for (int i = 1; i < n; i++) {
        // if (a[i] < a[i - 1]) {
        // // swap(a[i], a[i - 1]);
        // int temp = a[i];
        // a[i] = a[i - 1];
        // a[i - 1] = temp;

        // }
        // }
        // }

        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
