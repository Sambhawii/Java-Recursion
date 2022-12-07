public class Summofno {
    // isme 3 parameter needed hai...
    // ek jisko intialize krnge aur vo variable base condition tak implement
    // hoga-->i
    // ek base condition ko define krne ke liye-->n
    // ek value ko store karne ke liye-->sum
    public static void sumofno(int i, int n, int sum) {
        // base condition

        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sumofno(i + 1, n, sum);
    }

    // calling of function
    public static void main(String[] args) {
        sumofno(1, 6, 0);
    }
}
