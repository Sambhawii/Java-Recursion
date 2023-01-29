// A
// BB
// CCC
// DDDD
// EEEEE
public class Pattern7 {
    static int num = 65;

    static void printNum(int cols) {
        if (cols == 0) {
            return;
        }

        System.out.print((char) num);
        num = num + 1;
        printNum(cols - 1);
        num = 65;

    }

    static void printPattern(int rows) {
        if (rows == 0) {
            return;
        }
        printPattern(rows - 1);
        printNum(rows);
        System.out.println();
    }

    public static void main(String[] args) {
        printPattern(5);
    }

}