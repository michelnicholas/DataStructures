import javax.xml.stream.events.Characters;
import java.util.Stack;

public class StackDemo {
    /*
    Given a string that contains only brackets, write a method named isBalanced(String s)
    which returns true if brackets in the given String are balanced, otherwise returns false.
    Example:
    a . "{ [ ( ) ] }" - isBalanced(String s) should return true
    b . "{ } [ ] ( )" - isBalanced(String s) should return true
    c . "{ [ ( ] ) }" - isBalanced(String s) should return false
    d . "{ } [ ] ("   - isBalanced(String s) should return false

    Hint: When you come across a closing bracket, check if it matches with the LAST opening bracket that still open

    Stack is last in first out (LIFO)

     */

    static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack();

        for (char c: s.toCharArray()){
            if (c == '{' || c == '[' || c == '('){
            stack.push(c);
            }else if (c == '}'){
                    if (!(stack.pop()== '{')){
                        return false;
                }
            }else if (c == ']'){
                if (!(stack.pop() == '[')){
                    return false;
                }
            }else if (c == ')'){
                if (!(stack.pop() == '(')){
                    return false;
                }
            }
        }
        if (!(stack.empty())){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "{[()]}"; // balanced
        String s2 = "{}[]()"; // balanced
        String s3 = "{[(])}"; // not balanced
        String s4 = "{}[]("; // not balanced
        System.out.println("s1 is balanced: " + isBalanced(s1));
        System.out.println("s2 is balanced: " + isBalanced(s2));
        System.out.println("s3 is balanced: " + isBalanced(s3));
        System.out.println("s4 is balanced: " + isBalanced(s4));





    }

}
