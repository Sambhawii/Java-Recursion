public class Countrev {
    public static void countrev(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        countrev(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        countrev(n);

    }
}
