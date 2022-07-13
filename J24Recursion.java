// 3 steps for Recursion
// i) Find the base case.
// ii) Find the relation between the problem and subproblems.
// iii) Generalise the relation

public class J24Recursion {
    static void printHello(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("HELLO");
        printHello(n - 1);
    }

    public static void main(String[] args) {
        printHello(5);
    }
}
