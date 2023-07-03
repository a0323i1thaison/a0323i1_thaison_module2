package ss3_array_phuongthuc.bai_tap;
import java.util.Scanner;
public class gia_tri_lon_nhat {
    public static void main ( String [] args){
        Scanner scanner =new Scanner (System.in);
        System.out.println(" nhập số hàng của ma trận ");
        int hang = scanner.nextInt();
        System.out.println(" nhập vào số cột của ma trận ");
        int cot = scanner.nextInt();
        int [][] maxtric = new int [hang][cot];
        for ( int i = 0 ; i < hang ; i++){
            for ( int j = 0 ; j < cot ; j++){
                System.out.println(" nhập vào giá trị cho phần tử [" + i + "][" + j + "]");
                maxtric[i][j] = scanner.nextInt();
            }
        }
        int maxElement = maxtric[0][0];
        int maxhang = 0;
        int maxcot = 0;
        for (int i = 0 ; i < hang ; i++){
            for (int j = 0 ; j < cot ; j++){
                if ( maxtric[i][j] > maxElement){
                    maxElement = maxtric[i][j];
                    maxhang = i;
                    maxcot = j;
                }
            }
        }
        System.out.println(" phần tử có giá trị lớn nhất là :" + maxElement);
        System.out.println(" phần tử ở hàng :" + maxhang + " phần tử ở cột :" + maxcot );
    }
}
