package ss3_array_phuongthuc.bai_tap;
import java.util.Scanner;
public class dem_so_lan_xuat_hien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String str = "hello";
        System.out.println(" nhập một chuỗi từ bàn phím ");
        String str2 = scanner.nextLine();
        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == str2.charAt(i)) {
                    count++;
                }
            }
        }
        System.out.println("giá trị biến đếm là " + count);
    }
}