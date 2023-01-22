public class Count_ZeroR {

    public static int countDig(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num % 10 == 0) {
            count++;
        }
        return countDig(num / 10, count);
    }

    public static void main(String[] args) {
        int res = countDig(10200, 0);
        System.out.println(res);
    }

}
