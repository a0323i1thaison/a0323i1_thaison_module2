package ss5_accessmodifier.bai_tap;

public class Access_modifier {
    private double radius ;
    private String color ;
    public Access_modifier(){
        radius = 1.0;
        color = "red";
    }
    public Access_modifier(double radius){
        this.radius = radius;
        color = " red ";
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI * radius * radius ;
    }
}