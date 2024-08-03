public class Fibonanci {
    public static void main(String[] args) {
        int n = fibonanci(8);

        System.out.println("> " + n);
    }

    public static int fibonanci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonanci(n - 1) + fibonanci(n - 2);
    }
}

/*
0 1 1 2 3 5 
*/
