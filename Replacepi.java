class Replacepi {
    static String replace(String str, int i) {
        // termination case
        if (i == str.length()) {
            return "";
        }
        if (str.charAt(i) == 'p' && str.charAt(i + 1) == 'i') {
            return "3.14" + replace(str, i + 2);
        } else {
            return str.charAt(i) + replace(str, i + 1);
        }
    }

    public static void main(String[] args) {
        String str = "2 + pi * 6 * pi - pi";
        String str_2 = replace(str, 0);
        System.out.println(str_2);
    }
}