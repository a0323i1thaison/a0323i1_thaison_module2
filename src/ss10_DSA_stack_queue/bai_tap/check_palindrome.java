package ss10_DSA_stack_queue.bai_tap;
import java.util.LinkedList;
import java.util.Queue;
public class check_palindrome {
    public static boolean isPalindrome(String str) {
        Queue<Character> queue = new LinkedList<Character>();

        // Đưa các ký tự trong chuỗi vào trong Queue
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            queue.add(ch);
        }

        // Lấy lần lượt các ký tự từ Queue và so sánh với ký tự ở vị trí tương ứng trong chuỗi ban đầu
        while (!queue.isEmpty()) {
            char ch1 = queue.remove();

            if (str.length() == 0) {
                return false;
            }

            char ch2 = str.charAt(str.length() - 1);

            if (ch1 != ch2) {
                return false;
            }

            str = str.substring(0, str.length() - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "hello";

        System.out.println(str1 + " is " + (isPalindrome(str1) ? "" : "not ") + "a palindrome.");
        System.out.println(str2 + " is " + (isPalindrome(str2) ? "" : "not ") + "a palindrome.");
    }
}
