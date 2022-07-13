public class J26Power {
    static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return pow(a, b - 1) * a;

    }

    public static void main(String[] args) {
        System.out.println(pow(4, 8));
    }
}
