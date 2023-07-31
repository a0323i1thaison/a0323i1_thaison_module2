package ss13_thuat_toan_sap_xep.bai_tap;

public class insertionS {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j-1]; j--) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
        System.out.println("Mang da sap xep la:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
