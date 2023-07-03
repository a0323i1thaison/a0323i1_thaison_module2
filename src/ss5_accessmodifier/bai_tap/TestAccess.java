package ss5_accessmodifier.bai_tap;

public class TestAccess {
    public static void main(String[] args){
        Access_modifier access_modifier = new Access_modifier(3);
        double radius = access_modifier.getRadius();
        double area = access_modifier.getArea();
        System.out.println("Radius" + radius);
        System.out.println("Area" + area);
    }
}
