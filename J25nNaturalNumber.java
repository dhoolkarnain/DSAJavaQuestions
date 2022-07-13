class J25nNaturalNumber {
    static int natural(int n) {
        // int sum=0;
        if (n == 1) {
            return 1;
        }

        return n + natural(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(natural(8));
    }
}