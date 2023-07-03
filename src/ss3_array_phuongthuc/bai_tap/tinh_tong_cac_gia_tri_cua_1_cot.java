package ss3_array_phuongthuc.bai_tap;
import java.util.Scanner;
public class tinh_tong_cac_gia_tri_cua_1_cot {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int arr[][] = {{23,3,4,5},
                {43,5,7,8},
                {23,9,3,12}};
        System.out.println(" số cột bạn muốn cộng các giá trị là");
        int cot = scanner.nextInt();
        int add = 0 ;
        for ( int i = 0 ; i < arr.length ; i++){
                 add += arr[i][cot];
        }
        System.out.println(" tổng các phần tử ở cột " + cot + " tổng là :" + add);
    }
}
