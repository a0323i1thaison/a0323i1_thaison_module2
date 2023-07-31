package ss12_thuat_toan_tim_kiem.bai_tap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class string_search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();
        String[] substrings = input.split(" ");
        Arrays.sort(substrings, Comparator.comparingInt(String::length).reversed());
        System.out.println("Chuỗi con được sắp xếp theo thứ tự có độ dài lớn nhất:");
        for (String substring : substrings) {
            System.out.println(substring);
        }
    }
}
