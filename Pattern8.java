// 1
// 12
// 123
// 1234
// 12345
public class Pattern8 {
    static int num = 1;

    static void printNum(int cols) {
        if (cols == 0) {
            return;
        }
        System.out.println(num);
        printNum(cols - 1);

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
        printPattern(4);
    }

}