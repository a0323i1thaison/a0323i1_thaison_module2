package ss5_accessmodifier.bai_tap;

public class TestStudents {
    public static void main(String[]args){
        Students student = new Students();
        student.setName("Alice");
        student.setClasses("C01");
        System.out.println("Name: " + student.getName());
        System.out.println("Classes: " + student.getClasses());
    }
}
