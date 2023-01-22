// public class Count_digR {

//     public static int countDig(int num, int count) {
//         if (num == 0) {
//             return count;
//         }
//         return countDig(num / 10, count + 1);

//     }

//     public static void main(String[] args) {
//         int num = 3412;
//         int result = countDig(num, 0);
//         System.out.println(result);

//     }

// }
//-----------------------------------------------------------------------------------

//when count is not there
public class Count_digR {

    public static int countDig(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + countDig(num / 10);

    }

    public static void main(String[] args) {
        int num = 3412;
        int result = countDig(num);
        System.out.println(result);

    }

}