import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    /*
    Given a String (say "Hello World") print the following:
    a. Index/position of dupulicate characters?
    b. Total Number of Duplicate characters?
    Example: for String "Hello World"
    a. Index/position of Duplicate character(s): 3, 7, 9
    b. Total number of duplicate characters: 3

    Hint Whenever you se the term 'duplicate' duplicate in the question, most likely you should use 'Set' datastructure
     */

    public static void main(String[] args) {
        String s = "hello world";

        // created char array
        char[] charArray = s.toCharArray();
        Set<Character> set = new HashSet<Character>();

        int ctr = 0;
        for (int i = 0; i <charArray.length; i++){
            if (!set.add(charArray[i])){
                System.out.println("Index/position of duplicate character(s): " + i);
                ctr++;
            }
        }
        System.out.println("Total number of duplicate characters: " + ctr);

    }
}
