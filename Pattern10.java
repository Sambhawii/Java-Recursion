// -----*
// ----**
// ---***
// --****
// -*****
public class Pattern10 {
    static void printSpace(int cols) {
        if (cols == 0) {
            return;
        }
        System.out.print("_");
        printSpace(cols - 1);
    }

    static void printStar(int cols) {
        if (cols == 0) {
            return;
        }
        System.out.print("*");
        printStar(cols - 1);
    }

    static void printPattern(int rows, int cols) {
        if (rows == 0) {
            return;
        }

        System.out.println();
        printSpace(rows);
        printStar(cols);
        cols++;
        printPattern(rows - 1, cols);

    }

    public static void main(String[] args) {
        printPattern(5, 1);
    }

}
