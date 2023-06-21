
package ss3_array_phuongthuc.bai_tap;

import java.util.Scanner;

public class xoa_phan_tu {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int N = array.length;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào phần tử muốn xóa: ");
        int X = scanner.nextInt();
        int delete = -1;
        for (int i = 0; i < N; i++) {
            if (array[i] == X) {
                delete = i;
                break;
            }
        }
        if (delete != -1) {
            for (int i = delete; i < N - 1; i++) {
                array[i] = array[i + 1];
            }
            N--;
        }
        System.out.println("Mảng sau khi xóa:");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
