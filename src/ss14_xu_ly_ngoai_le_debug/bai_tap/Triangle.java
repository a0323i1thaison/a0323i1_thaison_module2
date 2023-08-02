package ss14_xu_ly_ngoai_le_debug.bai_tap;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        try {
            System.out.print("Nhập cạnh a: ");
            a = scanner.nextInt();
            System.out.print("Nhập cạnh b: ");
            b = scanner.nextInt();
            System.out.print("Nhập cạnh c: ");
            c = scanner.nextInt();

            if (a <= 0 || b <= 0 || c <= 0)
                throw new IllegalTriangleException("Cạnh không được âm!");

            if (a + b <= c || a + c <= b || b + c <= a)
                throw new IllegalTriangleException("Tổng 2 cạnh không lớn hơn cạnh còn lại!");

            System.out.println("Ba cạnh " + a + ", " + b + ", " + c + " tạo thành một tam giác.");
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}
