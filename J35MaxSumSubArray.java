
public class J35MaxSumSubArray {
    public static void main(String[] args) {
        int maxSum = 0;
        int[] a = { -5, 4, 6, -3, 4, -1 };
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum = sum + a[j];

            }
            if (maxSum < sum)
                maxSum = sum;
        }
        System.out.println(maxSum);
    }
}
