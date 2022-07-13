public class J11NumberOfBitToConvert {
    public static void main(String[] args) {
        int a = 22, b = 27;
        int count = 0;
        int mask = a ^ b;
        while (mask != 0) {
            if (mask % 2 != 0)
                count++;
            mask = mask >> 1;

        }
        System.out.println("Number of bit to change to convert " + a + " and " + b + " is " + count);
    }
}
