public class J30PowerSet {
    static void powerset(String s, int i, String cur) {
        if (i == s.length()) {
            System.out.println(cur);
            return;
        }
        powerset(s, i + 1, cur + s.charAt(i));
        powerset(s, i + 1, cur);
    }

    public static void main(String[] args) {
        powerset("abc", 0, "");
    }
}
