public class J34majorityElement {
    static int majorityElement(int a[]) {
        int ansIndex = 0;
        int count = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[ansIndex]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                ansIndex = i;
                count = 1;
            }
        }
        // check if answer index is actually the answer
        int count2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[ansIndex] == a[i])
                count2++;

        }
        if (count2 > a.length / 2)
            return a[ansIndex];
        else
            return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 3, 4, 3, 3, 3, 1, 1, 3, 1, 4 };
        System.out.println(majorityElement(arr));

    }
}
