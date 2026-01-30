package ParenthesesMatching;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class GfG {
    public static boolean isBalanced(String s) {
        // Stack to store opening brackets
       // Stack<Character> st = new Stack<>();

        // Using ArrayDeque is faster than using Stack class
        Deque<Character> st = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            }
            // Process closing brackets
            else if (c == ')' || c == '}' || c == ']') {
                // No opening bracket
                if (st.isEmpty()) return false;
                char top = st.peek();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
                // Pop matching opening bracket
                st.pop();
            }
        }
        // Balanced if stack is empty
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String[] testCases = {"[{()}]", "[()()]{}", "(]", "([{]})"};
        for (String s : testCases) {
            System.out.println("Input: " + s + " -> Output: " + (isBalanced(s) ? "true" : "false"));
        }
    }
}