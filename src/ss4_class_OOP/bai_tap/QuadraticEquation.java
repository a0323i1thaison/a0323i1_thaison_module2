package ss4_class_OOP.bai_tap;

import java.lang.Math;
import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public String calculateRoot() {
        double discriminant = calculateDiscriminant();

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return "Phương trình có hai nghiệm là : " + root1 + " and " + root2;
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return "Phương trình có 1 nghiệm là: " + root;
        } else {
            return "Phương trình không có nghiệm .";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập vào phần tử a");
        int  a = scanner.nextInt();
        System.out.println(" nhập vào phần tử b");
        int  b = scanner.nextInt();
        System.out.println(" nhập vào phần tử c");
        int  c = scanner.nextInt();
        QuadraticEquation equation = new QuadraticEquation(a,b,c );
        System.out.println(equation.calculateRoot());
    }
}

