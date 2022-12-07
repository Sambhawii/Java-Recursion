
// 1 
// 23
// 456
// 78910

public class Pattern_10 {

    static int k = 1;

    static void space(int noofspaces) {
        if (noofspaces == 0) {
            return;
        }
        System.out.print(" ");
        space(noofspaces - 1);
    }

    static void digit(int noofdigits) {
        if (noofdigits == 0) {
            return;
        }
        System.out.print(k);
        k = k + 1;

        digit(noofdigits - 1);

    }

    static void pattern(int n, int num) {
        if (n == 0) {
            return;
        }
        digit(num - n);

        System.out.println(" ");
        pattern(n - 1, num);

    }

    public static void main(String[] args) {
        int n = 5;
        pattern(n, n);
    }

}
