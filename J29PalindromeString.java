public class J29PalindromeString {
    static boolean isPalin(String s, int l, int r) {
        if (l >= r) {
            return true;
        }
        if (s.charAt(l) != s.charAt(r)) {
            return false;
        }
        return isPalin(s, l + 1, r - 1);
    }

    public static void main(String[] args) {
        String s = "abcba";
        System.out.println(isPalin(s, 0, s.length() - 1));
    }
}
