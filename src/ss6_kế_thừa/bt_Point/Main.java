package ss6_kế_thừa.bt_Point;

public class Main {
    public static void main(String[] args) {
        Point.Point2D point2d = new Point.Point2D(3, 4);
        System.out.println(point2d);
        Point.Point2D point2D1 = new Point.Point2D(3.0f, 5.0f);
        System.out.println(point2D1);
        Point.Point3D point3d = new Point.Point3D(1, 2, 3);
        System.out.println(point3d);
    }
}
