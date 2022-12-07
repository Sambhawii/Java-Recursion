public class Factorial {
    public static int fact(int i) {

        if (i == 1 || i == 0) {
            return 1;
        }

        int fa = fact(i - 1);
        int f = i * fa;
        return f;
    }

    public static void main(String[] args) {
        int i = 5;
        int k = fact(i);
        System.out.println(k);
    }
    
}
