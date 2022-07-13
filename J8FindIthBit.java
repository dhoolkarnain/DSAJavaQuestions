public class J8FindIthBit {
    public static void main(String[] args) {
        int n = 309;
        int i = 5;
        int mask = 1 << i - 1;

        if ((n ^ mask) != 0)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
