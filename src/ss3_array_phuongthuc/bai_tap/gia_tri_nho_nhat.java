package ss3_array_phuongthuc.bai_tap;

import java.util.Scanner;

public class gia_tri_nho_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
        int index = 0;
        int minElement = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" nhập vào phần tử ở vị trí " + i);
            arr[i] = scanner.nextInt();
            if (arr[i] < minElement) {
                minElement = arr[i];
                index = i;
            }
        }
        System.out.println(" giá trị phần tử nhỏ nhất trong mảng là :" + minElement);
        System.out.println(" vị trí của phần tử đó là  :" + index);
    }
}
