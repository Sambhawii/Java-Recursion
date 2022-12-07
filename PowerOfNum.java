import java.util.Scanner;

public class PowerOfNum {
    static boolean checkpower(int i, int n) {
        // termination condition
        if (i == 1) {
            return true;
        }
        // main logic
        if (i % n == 0) {
            checkpower(i / n, n);
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to be checked");
        int i = sc.nextInt();
        System.out.println("Enter the no whose power will be calculated");
        int n = sc.nextInt();

        System.out.println(checkpower(i, n));
        sc.close();
    }

}
