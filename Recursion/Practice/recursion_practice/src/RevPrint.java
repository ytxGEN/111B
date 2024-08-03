public class RevPrint {
    public static void main(String[] args) {
        rPrint("Hello");
    }

    public static void rPrint(String s) {
        if (s.isEmpty()) {
            return;
        }

        System.out.print(s.charAt(s.length() - 1));
        rPrint(s.substring(0, s.length() - 1)); // ending index is exclusive
    }
}
