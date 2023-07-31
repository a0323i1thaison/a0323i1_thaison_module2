package ss12_thuat_toan_tim_kiem.bai_tap;
import java.util.Scanner;
public class LongestSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int maxLength = 0;
        String longestSubstring = "";

        for (int i = 0; i < str.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < str.length(); j++) {
                char c = str.charAt(j);
                if (sb.toString().indexOf(c) == -1) {
                    sb.append(c);
                } else {
                    break;
                }
            }
            if (sb.length() > maxLength) {
                maxLength = sb.length();
                longestSubstring = sb.toString();
            }
        }

        System.out.println("Longest substring: " + longestSubstring);
    }
}
