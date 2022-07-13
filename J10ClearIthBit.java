public class J10ClearIthBit {
    public static void main(String[] args) {
        int n = 309;
        System.out.println(Integer.toBinaryString(n));
        int i = 5;
        int mask = (~(1 << (i - 1)));
        System.out.println(Integer.toBinaryString(mask));
        n = n & mask;
        System.out.println(Integer.toBinaryString(n));
    }
}
