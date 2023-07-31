package ss10_DSA_stack_queue.bai_tap;
import java.util.Stack;
public class BracketChecker {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expr1 = "s * (s – a) * (s – b) * (s – c)";
        String expr2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        String expr3 = "s * (s – a) * (s – b * (s – c)";
        String expr4 = "s * (s – a) * s – b) * (s – c)";
        String expr5 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";

        System.out.println(expr1 + " is " + (isBalanced(expr1) ? "balanced." : "not balanced."));
        System.out.println(expr2 + " is " + (isBalanced(expr2) ? "balanced." : "not balanced."));
        System.out.println(expr3 + " is " + (isBalanced(expr3) ? "balanced." : "not balanced."));
        System.out.println(expr4 + " is " + (isBalanced(expr4) ? "balanced." : "not balanced."));
        System.out.println(expr5 + " is " + (isBalanced(expr5) ? "balanced." : "not balanced."));
    }
}
