public class J13BitManipulation1 {
    public static void main(String[] args) {
        int[] a = { 2, 4, 5, 3, 4, 2, 5, 6, 6 };
        int rev = 0;
        for (int i = 0; i < a.length; i++) {
            rev = rev ^ a[i];

        }
        System.out.println("Only Non Repeating Element " + rev);
    }
}
