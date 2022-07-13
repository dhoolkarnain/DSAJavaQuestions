public class J17BitXOR {
    public static void main(String[] args) {
        int xor = 0;
        int n = 20;
        for (int i = 1; i <= n; i++) {
            xor = xor ^ i;
            System.out.println(xor);
        }
        System.out.println("final xor" + xor);
    }
}
