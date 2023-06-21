package ss3_array_phuongthuc.bai_tap;
import java.util.Scanner;

public class gop_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tạo 2 mảng số với kích thước cho trước
        int[] array1 = new int[5];
        int[] array2 = new int[3];

        // Bước 2: Sử dụng vòng lặp nhập giá trị cho các phần tử trong mảng
        System.out.println("Nhập các phần tử cho mảng 1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Nhập các phần tử cho mảng 2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Bước 3: Tạo mảng thứ 3 có kích thước bằng kích thước mảng 1 + kích thước mảng 2
        int[] array3 = new int[array1.length + array2.length];

        // Bước 4: Gán các phần tử từ mảng 1 vào mảng 3
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        // Bước 5: Gán các phần tử từ mảng 2 vào mảng 3
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }

        // In ra mảng 3 sau khi gộp
        System.out.println("Mảng sau khi gộp:");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
