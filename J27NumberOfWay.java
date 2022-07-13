public class J27NumberOfWay {
    static int ways(int n, int m) {
        if (n == 1 || m == 1) {
            return 1;
        }
        return ways(n, m - 1) + ways(n - 1, m);
    }

    public static void main(String[] args) {
        System.out.println(ways(3, 4));

    }
}
