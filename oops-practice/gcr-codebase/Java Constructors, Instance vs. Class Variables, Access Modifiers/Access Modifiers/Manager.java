public class Manager extends Employee {
    private String level;

    public Manager(int employeeID, String department, double salary, String level) {
        super(employeeID, department, salary);
        this.level = level;
    }

    public void displayManager() {
        // can access public employeeID and protected department
        System.out.println("Manager:");
        System.out.println("ID (public): " + employeeID);
        System.out.println("Department (protected): " + department);
        System.out.println("Salary (via getter): " + getSalary());
        System.out.println("Level: " + level);
        System.out.println();
    }
}
