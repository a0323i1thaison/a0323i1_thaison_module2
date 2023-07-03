package ss6_kế_thừa.bai_tap;

public class Circle {
    private double radius ;
    private String color ;
    public Circle(double radius,String color){
        this.radius =radius;
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void getColor(String color){
        this.color = color;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public String toString(){
        return "Circle [radius=" + radius + ",color=" + color +"]";
    }
}
