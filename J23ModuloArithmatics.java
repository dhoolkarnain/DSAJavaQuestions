public class J23ModuloArithmatics {
    static long fastPower(int a, int b, int n) {
        // int res = 1;
        // while (b > 0) {
        // if ((b & 1) != 0) {
        // res = res * a;
        // }
        // a = a * a;
        // b = b >> 1;
        // }
        // return res;
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                res = (res % n * a % n) % n;
            }
            a = (a % n * a % n) % n;
            b = b >> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(fastPower(33562728, 5, 1000000007));
    }
}
