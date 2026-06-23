import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int employeeId;
    String name;
    String department;
    double salary;
    
    Employee(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    void display() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Department: " + department + ", Salary: " + salary);
    }
}

public class EmployeeSkillAssignment {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter employee details:");
            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Department: ");
            String dept = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            
            Employee emp = new Employee(id, name, dept, salary);
            
            FileOutputStream fos = new FileOutputStream("employee.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.close();
            fos.close();
            
            System.out.println("Employee serialized successfully");
            
            FileInputStream fis = new FileInputStream("employee.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee recoveredEmp = (Employee) ois.readObject();
            ois.close();
            fis.close();
            
            System.out.println("Recovered Employee Information:");
            recoveredEmp.display();
            
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
