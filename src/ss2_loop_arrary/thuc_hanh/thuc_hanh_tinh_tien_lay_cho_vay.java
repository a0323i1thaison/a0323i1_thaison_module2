package ss2_loop_arrary.thuc_hanh;
import java.util.Scanner;
public class thuc_hanh_tinh_tien_lay_cho_vay {
    public static void main(String[] args){
        double money = 1.0;
        int month = 1;
        double interesRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter investment amount: ");
        money = input.nextDouble();
        System.out.println(" Enter number of months: ");
        month = input.nextInt();
        System.out.println(" Enter annual interest rate in percentage: ");
        interesRate = input.nextDouble();
        double total = 0;
        for ( int i = 0 ; i < month; i++){
            total += money * (interesRate/100)/12 * month;
        }
        System.out.println(" Total of interest : " + total);
    }
}
