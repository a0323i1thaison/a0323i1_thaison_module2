package ss3_array_phuongthuc.bai_tap;

import java.util.Scanner;

public class them_phan_tu {
    public static void main(String[] arge) {
        int[] array = {1, 2, 3, 4, 5};
        int length = array.length;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập vào phần tử cần chèn ");
        int X = scanner.nextInt();
        System.out.println(" nhập vào vị trí cần chèn ");
        int index = scanner.nextInt();
        if (index <= 0 && index >= length - 1) {
            System.out.println(" hiển thị không được chèn vào mảng ");
        } else {
            int[] newArray = new int[length + 1];
            for (int i = 0, j = 0; i < length + 1; i++, j++) {
                if (i == index) {
                    newArray[i] = X;
                    j--;
                } else {
                    newArray[i] = array[j];
                }
            }
            System.out.print("Mảng sau khi chèn: ");
            for (int i = 0; i < length + 1; i++) {
                System.out.print(newArray[i] + " ");
            }
        }
    }
}

