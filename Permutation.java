//ALTERNATIVE METHORD
public class StringPermutations {

    public static void main(String args[]) {
        permutation("123");
    }

   public static void permutation(String input){
          permutation("", input);
   }

   /*
    * Recursive method which actually prints all permutations
    * of given String, but since we are passing an empty String
    * as current permutation to start with 
    */
   public static void permutation(String perm, String word) {
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
