import java.util.ArrayList;

//get all the subsequence of a string and store in arraylist and return it
//string--"ravi"
class subsequence {
    static ArrayList<String> subsq(String str) {
        // termination case
        if (str.length() == 0) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(" ");
            return arr;
        }
        char current = str.charAt(0);
        String remaining = str.substring(1);
        ArrayList<String> temp = subsq(remaining);

        ArrayList<String> result = new ArrayList<>();
        for (String s : temp) {
            result.add(s);
            result.add(current + s);

        }
        return result;
    }

    public static void main(String[] args) {
        String str = "Ravi";
        System.out.println(subsq(str));
        System.out.println(subsq(str).size());
    }
}



public class StringPermutations {

    public static void main(String args[]) {
        permutation("123");
    }

   
 /*
  * A method exposed to client to calculate permutation of String in Java. 
  */
   public static void permutation(String input){
          permutation("", input);
   }

   /*
    * Recursive method which actually prints all permutations
    * of given String, but since we are passing an empty String
    * as current permutation to start with,
    * I have made this method private and didn't exposed it to client. 
    */
   private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.err.println(perm + word);

        } else {
            for (int i = 0; i &lt; word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) 
                                + word.substring(i + 1, word.length()));
            }
        }

    }
}
