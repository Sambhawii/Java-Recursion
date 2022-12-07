
// *        * 
//  *      * 
//   *    * 
//    *  *  
//     **  
//    *  *  
//   *    *  
//  *      *
// *        *
public class Pattern_8 {
    static void space(int noofspaces) {
        if (noofspaces == 0) {
            return;
        }
        System.out.print(" ");
        space(noofspaces - 1);
    }

    static void star(int noofstars) {
        if (noofstars == 0) {
            return;
        }
        System.out.print("*");
        star(noofstars - 1);

    }

    static void patternL(int n, int num) {
        if (n == 0) {
            return;
        }
        space(n - 1);
        star(1);
        space(2 * (num - n) + 1);
        star(1);
        System.out.println(" ");
        patternL(n - 1, num);
    }

    static void patternU(int n, int num) {
        if (n == 0) {
            return;
        }
        space(num - n);
        star(1);
        space(2 * n - 1);
        star(1);
        System.out.println(" ");
        patternU(n - 1, num);
    }

    public static void main(String[] args) {
        int n = 14;
        patternU(n, n);
        patternL(n - 1, n);
    }

}
