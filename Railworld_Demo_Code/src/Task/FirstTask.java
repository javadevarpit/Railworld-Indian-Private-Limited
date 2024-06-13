package Task;
import java.util.*;
public class FirstTask {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int street_no = sc.nextInt();
        String city = sc.next();
        int pin = sc.nextInt();
        Employee employee = new Employee();
        employee.setName(name,street_no,city,pin);
        System.out.println(employee.getName() +" " + employee.getStreet_No() +" " + employee.getPin() + " " + employee.getCity());



    }
}
