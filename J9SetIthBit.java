public class J9SetIthBit {
    public static void main(String[] args) {
        int n = 309;
        System.out.println("Number before " + Integer.toBinaryString(n));
        int i = 5;
        int mask = 1 << i - 1;
        System.out.println("Mask " + Integer.toBinaryString(mask));
        n = n | mask;
        System.out.println(n);
        System.out.println("Number after " + Integer.toBinaryString(n));
    }
}
