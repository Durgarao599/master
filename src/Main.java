import java.util.ArrayDeque;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        System.out.println(Main.validate("{}[]()"));
    }

    Stack s = new Stack();

    public static boolean validate(String str) {

        char[] ch = str.toCharArray();
        ArrayDeque<Character> stack = new ArrayDeque<Character>();

        for (Character c : ch) {
            if (c.equals('{') || c.equals('(') || c.equals('[')) {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            }
            else if ((c.equals('}') && stack.peek().equals('{')) || (c.equals(')') && stack.peek().equals('(')) || (c.equals(']') && stack.peek().equals('['))) {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
