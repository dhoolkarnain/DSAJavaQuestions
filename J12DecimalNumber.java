public class J12DecimalNumber {
    public static int log10(int N) {

        // calculate log2 N indirectly
        // using log() method
        int result = (int) (Math.log(N) / Math.log(10));

        return result;
    }

    public static void main(String[] args) {
        int n = 354679;
        System.out.println("Number of digit " + (log10(n) + 1));
    }
}
