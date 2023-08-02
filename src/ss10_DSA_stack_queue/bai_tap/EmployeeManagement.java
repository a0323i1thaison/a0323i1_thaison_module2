package ss10_DSA_stack_queue.bai_tap;
import java.io.*;
import java.util.*;
class Employee{
    private String name ;
    private char gender;
    private String dob;
    public Employee ( String n , char g , String d){
        name = n;
        gender = g ;
        dob = d ;
    }
    public String toString (){
        return name + " , " + gender + " , " + dob;
    }
    public char getGender(){
        return gender;
    }
}
public class EmployeeManagement {
    public static void main ( String[] args){
        Queue<Employee> femaleQueue = new LinkedList<>();
        Queue<Employee> maleQueue = new LinkedList<>();

        try (Scanner input = new Scanner(new File("employees.txt"));
             PrintWriter femaleOutput = new PrintWriter(new FileWriter("female_employees.txt"));
             PrintWriter maleOutput = new PrintWriter(new FileWriter("male_employees.txt"))) {

            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] fields = line.split(",");
                Employee employee = new Employee(fields[0], fields[1].charAt(0), fields[2]);

                if (employee.getGender() == 'F') {
                    femaleQueue.offer(employee);
                } else {
                    maleQueue.offer(employee);
                }
            }

            while (!femaleQueue.isEmpty()) {
                femaleOutput.println(femaleQueue.poll());
            }

            while (!maleQueue.isEmpty()) {
                maleOutput.println(maleQueue.poll());
            }

            System.out.println("Demerging completed.");

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found.");
        } catch (IOException e) {
            System.out.println("Error writing to output file.");
        }
    }
}
