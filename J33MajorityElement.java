//Boyer-Moore majority vote algorithm

public class J33MajorityElement {
    public static void main(String[] args) {
        int[] a = { 5, 1, 4, 5, 1, 5, 0, 5, 5, 3, 5, 9, 5 };
        int count;
        int n = a.length;
        int[] maj = new int[a.length];
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            maj[i] = count;
        }
        for (int i = 0; i < maj.length; i++) {
            if (maj[i] > n / 2) {

                System.out.println(a[i]);
                break;
            }
        }

    }
}
