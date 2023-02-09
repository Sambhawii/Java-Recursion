import java.util.Scanner;

public class TableOfNum {
    public static void numtable(int n, int i) {
        if (i == 11) {
            return;
        }
        System.out.println(n + "*" + i + "=" + n * i);
        numtable(n, i + 1);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        numtable(num, 1);
        scan.close();
    }
}