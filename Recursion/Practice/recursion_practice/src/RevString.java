public class RevString {
    public static void main(String[] args) {
        String test = "Hello";
        String s = rString(test);

        System.out.println(s);
    }

    public static String rString(String s) {
        if (s.isEmpty()) {
            return s;
        }

        return rString(s.substring(1)) + s.charAt(0);
    }
}

/*
Hello

ello

llo

lo

olleH
*/