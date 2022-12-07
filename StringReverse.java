
public class StringReverse {
    static void ReverseString(String Str) {
        if ((Str == null) || (Str.length() <= 1)) {
            System.out.println(Str);

        } else {
            System.out.print(Str.charAt(Str.length() - 1));
            ReverseString(Str.substring(0, Str.length() - 1));
        }

    }

    public static void main(String[] args) {
        String str = "This is JAVA Program";
        ReverseString(str);

    }

}
