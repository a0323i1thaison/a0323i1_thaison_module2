package ss2_loop_arrary.thuc_hanh;
import java.util.Scanner;
public class thuc_hanh_tinh_uoc_chung_lon_nhat {
    public static void main( String[] args){
        int a ;
        int b ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a : ");
        a = input.nextInt();
        System.out.println(" Enter b : ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if ( a == 0 || b == 0 ){
            System.out.println(" No great common factor ");
        }
        while ( a != b ){
            if ( a > b){
                a = a - b ;
            }else {
                b = b - a ;
            }
        }
        System.out.println(" Grestest common factor : " + a);
    }
}
