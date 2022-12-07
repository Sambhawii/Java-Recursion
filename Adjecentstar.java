public class Adjecentstar {
    static String starprint(String str, int i) {
        // termination case
        if (i == str.length() - 1) {
            return " ";
        }
        // main logic
        if (str.charAt(i) == str.charAt(i + 1)) {
            return str.charAt(i) + "*" + str.charAt(i + 1) + starprint(str, i);
        } else {
            return starprint(str, i);
        }

    }

    public static void main(String[] args) {
        String str = "xxyy";
        String result = starprint(str, 0);
        System.out.println(result);
    }
}
// climb stair
// fibonacci
// rat in maze