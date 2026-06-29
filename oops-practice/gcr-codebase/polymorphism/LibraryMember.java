// Superclass for Smart Library Membership System
public abstract class LibraryMember {
    protected String memberName;
    protected String memberId;
    protected int booksIssued;

    public LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
        this.booksIssued = 0;
    }

    // Abstract method to be overridden by subclasses
    public abstract double calculateFine(int overdueDays);

    public String getMemberName() {
        return memberName;
    }

    public String getMemberId() {
        return memberId;
    }

    public int getBooksIssued() {
        return booksIssued;
    }

    public void issueBook() {
        this.booksIssued++;
    }

    public void returnBook() {
        if (this.booksIssued > 0) {
            this.booksIssued--;
        }
    }

    public void printMemberDetails() {
        System.out.println("Member Name: " + memberName + 
                         " | Member ID: " + memberId + 
                         " | Books Issued: " + booksIssued);
    }
}
