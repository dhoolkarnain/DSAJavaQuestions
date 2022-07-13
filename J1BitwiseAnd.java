public class J1BitwiseAnd {
    public static void main(String[] args) {
        int a = 3, b = 5;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        int var = a & b;
        System.out.println(Integer.toBinaryString(var));
    }
}