// Student Member class - calculates fine for student members
public class StudentMember extends LibraryMember {
    private String rollNumber;
    private int semester;

    public StudentMember(String memberName, String memberId, String rollNumber, int semester) {
        super(memberName, memberId);
        this.rollNumber = rollNumber;
        this.semester = semester;
    }

    @Override
    public double calculateFine(int overdueDays) {
        // Students pay Rs. 2 per day for overdue books (lowest rate)
        double finePerDay = 2.0;
        return overdueDays * finePerDay;
    }

    public void printMemberDetails() {
        System.out.print("[STUDENT] ");
        super.printMemberDetails();
        System.out.println("           Roll Number: " + rollNumber + 
                         " | Semester: " + semester);
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public int getSemester() {
        return semester;
    }
}
