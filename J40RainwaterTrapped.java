public class J40RainwaterTrapped {
    public static void main(String[] args) {
        // int[] a = { 3, 1, 2, 4, 0, 1, 3, 2 };
        int[] a = { 4, 2, 0, 3, 2, 5 };
        int n = a.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int maxLeft = a[0];
        int maxRight = a[n - 1];
        left[0] = maxLeft;
        right[n - 1] = maxRight;

        for (int i = 1; i < n; i++) {
            if (a[i] > maxLeft) {
                maxLeft = a[i];
                left[i] = maxLeft;
            } else {
                left[i] = maxLeft;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > maxRight) {
                maxRight = a[i];
                right[i] = maxRight;
            } else {
                right[i] = maxRight;
            }
        }

        int rainTrapped = 0;

        for (int i = 0; i < n; i++) {
            rainTrapped += Math.min(left[i], right[i]) - a[i];
        }
        System.out.println(rainTrapped);
    }
}
