public class J4BitwiseNot {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(Integer.toBinaryString(a));
        // System.out.println(Integer.toBinaryString(b));
        int var = ~a;
        System.out.println(Integer.toBinaryString(var));
    }
}
