import java.util.Scanner;

public class Employee {
    public static void main(String[]args){
        EmployeeDetail emp = new EmployeeDetail();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.nextLine();
        System.out.println("Enter Salary");
        float salary = sc.nextFloat();
        System.out.println("Enter number of hours of work");
        float hours = sc.nextFloat();

        /*calling methods of EmployeeDetail Class*/
        emp.getInfo(name,salary,hours);
        salary = emp.Addsal();
        salary = emp.AddWork();

        TestEmployee test = new TestEmployee(salary);
        test.printSal();
    }
}
