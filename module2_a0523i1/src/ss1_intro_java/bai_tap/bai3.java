package ss1_intro_java.bai_tap;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
          Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số tiền USD bạn muốn chuyển: ");
        usd = scanner.nextDouble();
        double result = usd * vnd;
        System.out.println("Số tiền quy đổi: " + result + " VND");
    }
}