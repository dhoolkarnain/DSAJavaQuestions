// Kadane's equation

public class J36MaxSumSubArray {
    static int maxSumSubArray(int a[]) {
        int maxSum = 0;
        int curSum = 0;
        for (int i = 0; i < a.length; i++) {
            curSum = curSum + a[i];
            if (curSum > maxSum) {
                maxSum = curSum;
            }
            if (curSum < 0) {
                curSum = 0;
            }
        }
        return maxSum;

    }

    public static void main(String[] args) {
        int[] arr = { -5, 4, 6, -3, 4, -1 };
        System.out.println(maxSumSubArray(arr));
    }
}
