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

//By user input

public class Recursion {
    static int factorial(int num){
        //termination case:
        if(num==1){
            return num;
        }
        //small problem is n*(n-1) + put in cycle
        return(num * factorial(num-1));
    }
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int result = factorial(x);

        System.out.println("Factorial is :" + result);
    }
    
}

