package ss13_thuat_toan_sap_xep.bai_tap;
public class InsertionSort {
    public static void main ( String[]args) {
        int[] arr = {5, 6, 7, 8, 2, 3, 9, 1};
        System.out.println(" Mảng trước khi sắp xếp ");
        printArr(arr);
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.println("Sau bước " + i + ":");
            printArr(arr);
        }
        System.out.println("Mảng sau khi sắp xếp:");
        printArr(arr);
    }
    public static void printArr (int[]arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}