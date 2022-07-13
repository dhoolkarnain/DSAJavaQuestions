public class J20TrailingZeroes {
    public static void main(String[] args) {
        int trail = 0;
        int n = 243;
        for (int i = 5; i < n; i = i * 5) {
            trail = trail + (n / i);
        }
        System.out.println(trail);
    }
}
