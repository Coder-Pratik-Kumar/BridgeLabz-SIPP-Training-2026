// Guest Member class - calculates fine for guest members
public class GuestMember extends LibraryMember {
    private String guestType; // "Temporary", "Visiting Scholar", etc.
    private int membershipDays;

    public GuestMember(String memberName, String memberId, String guestType, int membershipDays) {
        super(memberName, memberId);
        this.guestType = guestType;
        this.membershipDays = membershipDays;
    }

    @Override
    public double calculateFine(int overdueDays) {
        // Guest members pay Rs. 10 per day for overdue books (highest rate)
        double finePerDay = 10.0;
        return overdueDays * finePerDay;
    }

    public void printMemberDetails() {
        System.out.print("[GUEST] ");
        super.printMemberDetails();
        System.out.println("         Guest Type: " + guestType + 
                         " | Membership Days: " + membershipDays);
    }

    public String getGuestType() {
        return guestType;
    }

    public int getMembershipDays() {
        return membershipDays;
    }
}
