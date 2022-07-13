public class J16BitFlipping {
    public static void main(String[] args) {
        int A = 5;
        System.out.println(Integer.toBinaryString(A));
        int n = (int) (Math.log(A) / Math.log(2)) + 1;
        System.out.println(Integer.toBinaryString(n));
        for (int i = 0; i < n; i++) {
            A = (A ^ (1 << i));
            System.out.println(Integer.toBinaryString(A));
        }
        System.out.println(Integer.toBinaryString(A));
    }
}