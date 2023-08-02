package ss17_string_regex.bai_tap;
import java.util.Scanner;
public class checkPhone {
    public static boolean checkP ( String numberPhone){
        String pattern = "^\\(\\[1-9]{2,4}\\)-\\(0\\[0-9]{9}\\)$";
        return numberPhone.matches(pattern);
    }
    public static void main ( String[]agrs){
        Scanner scaner = new Scanner(System.in);
        System.out.println(" nhập vào số điện thoại của bạn ");
        String numberPhone = scaner.nextLine();
        if ( checkP(numberPhone)){
            System.out.println(" số điện thoại của bạn hợp lệ ");
        }else{
            System.out.println(" số điện thoại của bạn không hợp lệ");
        }
    }
}
