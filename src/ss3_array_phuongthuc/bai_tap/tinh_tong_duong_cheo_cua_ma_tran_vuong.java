package ss3_array_phuongthuc.bai_tap;
import java.util.Scanner;
public class tinh_tong_duong_cheo_cua_ma_tran_vuong {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập số hàng , cột ma trận ");
        int size = scanner.nextInt();
        double [][] maxtric = new double [size][size];
        for ( int i = 0 ; i < size ; i++){
            for ( int j = 0 ; j < size ; j++){
                System.out.println(" nhập vào giá trị cho phần tử [" + i + "][" + j + "]");
                maxtric[i][j] = scanner.nextDouble();
            }
        }
        int sum = 0 ;
        for ( int i = 0 ; i < size ; i++){
            sum += maxtric[i][i];
        }
        System.out.println(" tổng các giá trị là : " + sum);
    }
}
