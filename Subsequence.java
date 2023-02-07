

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


