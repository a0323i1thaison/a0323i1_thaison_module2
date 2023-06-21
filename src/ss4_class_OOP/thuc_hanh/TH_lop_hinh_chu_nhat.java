package ss4_class_OOP.thuc_hanh;
import java.util.Scanner;
public class TH_lop_hinh_chu_nhat {
    public static void main(String[] arge){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Width");
        double width = scanner.nextDouble();
        System.out.println(" Enter the height ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
