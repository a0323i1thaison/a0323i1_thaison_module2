package ss17_string_regex.bai_tap;
import java.util.Scanner;
public class checkNameClass {
    public static boolean Validate (String className){
        String pattern = "^[CAP][0-9]{4}[GHIKLMN][0-9]{1}$";
        return className.matches(pattern);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập vào tên lớp của bạn ");
        String className = scanner.nextLine();
        if ( Validate(className)){
            System.out.println(" tên lớp của bạn đúng định dạng ");
        }else {
            System.out.println(" tên lớp của bạn không đúng định dạng");
        }
    }
}
