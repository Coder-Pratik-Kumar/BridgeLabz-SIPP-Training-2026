// Faculty Member class - calculates fine for faculty members
public class FacultyMember extends LibraryMember {
    private String department;
    private String designation;

    public FacultyMember(String memberName, String memberId, String department, String designation) {
        super(memberName, memberId);
        this.department = department;
        this.designation = designation;
    }

    @Override
    public double calculateFine(int overdueDays) {
        // Faculty members pay Rs. 5 per day for overdue books (higher rate than students)
        double finePerDay = 5.0;
        return overdueDays * finePerDay;
    }

    public void printMemberDetails() {
        System.out.print("[FACULTY] ");
        super.printMemberDetails();
        System.out.println("          Department: " + department + 
                         " | Designation: " + designation);
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }
}
