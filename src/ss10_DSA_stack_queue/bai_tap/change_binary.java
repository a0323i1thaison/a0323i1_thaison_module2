package ss10_DSA_stack_queue.bai_tap;
import java.util.Scanner;
import java.util.Stack;
public class change_binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        scanner.close();

        Stack<Integer> stack = new Stack<>();

        while (decimalNumber != 0) {
            int remainder = decimalNumber % 2;
            stack.push(remainder);
            decimalNumber /= 2;
        }

        System.out.print("The binary representation is: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
