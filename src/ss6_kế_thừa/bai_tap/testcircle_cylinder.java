package ss6_kế_thừa.bai_tap;

public class testcircle_cylinder {
        public static void main(String[] args) {
            // Tạo một đối tượng Circle
            Circle myCircle = new Circle(2.0, "blue");

            // In ra bán kính và diện tích của Circle
            System.out.println("Bán kính của hình tròn là: " + myCircle.getRadius());
            System.out.println("Diện tích của hình tròn là: " + myCircle.getArea());

            // Thay đổi bán kính và màu của Circle
            myCircle.setRadius(3.0);
            myCircle.setColor("green");

            // In ra thông tin chi tiết của Circle
            System.out.println(myCircle);

            // Tạo một đối tượng Cylinder
            Cylinder myCylinder = new Cylinder(2.0, "blue", 3.0);

            // In ra chiều cao và thể tích của Cylinder
            System.out.println("Chiều cao của hình trụ là: " + myCylinder.getHeight());
            System.out.println("Thể tích của hình trụ là: " + myCylinder.getVolume());

            // Thay đổi chiều cao của Cylinder
            myCylinder.setHeight(4.0);

            // In ra thông tin chi tiết của Cylinder
            System.out.println(myCylinder);
        }
    }
