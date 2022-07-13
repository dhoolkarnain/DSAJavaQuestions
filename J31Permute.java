public class J31Permute {
    static String swap(String s, int l, int i) {
        int temp = l;
        l = i;
        i = temp;
        return s;
    }

    static void Permute(String s, int l, int r) {
        if (l == r) {
            System.out.println(s);
            return;
        }
        for (int i = l; i <= r; i++) {
            s = swap(s, l, i);
            Permute(s, l + 1, r);
            s = swap(s, l, i);

        }
    }

    public static void main(String[] args) {
        Permute("abc", 0, 2);
    }
}
