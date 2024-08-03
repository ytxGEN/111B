public class Factorial {
    public static void main(String[] args) {
        int n = factorial(3);
        System.out.println(n);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
