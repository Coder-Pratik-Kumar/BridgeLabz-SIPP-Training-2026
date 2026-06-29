// Smart Library Membership System Main - demonstrating polymorphic fine calculation
public class SmartLibraryMain {
    
    public static void main(String[] args) {
        System.out.println("\n╔═══════════════════════════════════════════════════════╗");
        System.out.println("║    SMART LIBRARY MEMBERSHIP SYSTEM                    ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝\n");
        
        // Create library members of different types
        LibraryMember[] members = new LibraryMember[6];
        
        members[0] = new StudentMember("Aarav Singh", "STU001", "21B101", 4);
        members[1] = new FacultyMember("Dr. Priya Sharma", "FAC001", "Computer Science", "Assistant Professor");
        members[2] = new GuestMember("John Smith", "GUEST001", "Visiting Scholar", 30);
        members[3] = new StudentMember("Anaya Patel", "STU002", "21B205", 3);
        members[4] = new FacultyMember("Prof. Rajesh Kumar", "FAC002", "Electronics", "Professor");
        members[5] = new GuestMember("Sarah Johnson", "GUEST002", "Temporary", 15);
        
        // Issue books to members
        for (LibraryMember member : members) {
            member.issueBook();
            member.issueBook();
        }
        
        // Display member directory
        System.out.println("╔════════════════ LIBRARY MEMBER DIRECTORY ═════════════╗\n");
        displayAllMembers(members);
        System.out.println("╚═══════════════════════════════════════════════════════╝\n");
        
        // Calculate and display fines using polymorphic dispatch
        System.out.println("╔════════════════ FINE CALCULATION REPORT ═══════════════╗\n");
        calculateAndDisplayFines(members, 10); // 10 days overdue
        System.out.println("╚═══════════════════════════════════════════════════════╝\n");
        
        // Find member by ID
        System.out.println("╔════════════════ MEMBER SEARCH ═══════════════════════╗\n");
        searchAndDisplayMember(members, "STU002");
        System.out.println("\n╚═══════════════════════════════════════════════════════╝\n");
        
        // Display summary statistics
        displayLibrarySummary(members);
    }
    
    // Display all members in the library system
    public static void displayAllMembers(LibraryMember[] members) {
        System.out.println("Total Members: " + members.length + "\n");
        for (int i = 0; i < members.length; i++) {
            System.out.println((i + 1) + ". ");
            members[i].printMemberDetails();
        }
    }
    
    // Calculate and display fines using dynamic method dispatch
    public static void calculateAndDisplayFines(LibraryMember[] members, int overdueDays) {
        System.out.println("Overdue Days: " + overdueDays + "\n");
        System.out.println("Fine Breakdown by Member Type:\n");
        
        double totalFine = 0;
        
        for (LibraryMember member : members) {
            double fine = member.calculateFine(overdueDays);  // Polymorphic call
            totalFine += fine;
            
            String memberType = "";
            if (member instanceof StudentMember) {
                memberType = "STUDENT";
            } else if (member instanceof FacultyMember) {
                memberType = "FACULTY";
            } else if (member instanceof GuestMember) {
                memberType = "GUEST";
            }
            
            System.out.printf("[%s] %-25s (ID: %-10s) - Fine: Rs. %.2f%n", 
                            memberType, member.getMemberName(), member.getMemberId(), fine);
        }
        
        System.out.println("\n───────────────────────────────────────────────────────");
        System.out.printf("Total Fine Amount: Rs. %.2f%n", totalFine);
        System.out.println("───────────────────────────────────────────────────────");
    }
    
    // Search and display member details by ID
    public static void searchAndDisplayMember(LibraryMember[] members, String searchId) {
        System.out.println("Searching for Member ID: " + searchId + "\n");
        
        boolean found = false;
        for (LibraryMember member : members) {
            if (member.getMemberId().equalsIgnoreCase(searchId)) {
                System.out.println("✓ Member Found!\n");
                member.printMemberDetails();
                
                System.out.println("\nMember Details:");
                System.out.println("  • Total Books Issued: " + member.getBooksIssued());
                
                // Display specific details based on member type
                if (member instanceof StudentMember) {
                    StudentMember student = (StudentMember) member;
                    System.out.println("  • Roll Number: " + student.getRollNumber());
                    System.out.println("  • Semester: " + student.getSemester());
                    System.out.println("  • Fine Rate: Rs. 2 per day");
                } else if (member instanceof FacultyMember) {
                    FacultyMember faculty = (FacultyMember) member;
                    System.out.println("  • Department: " + faculty.getDepartment());
                    System.out.println("  • Designation: " + faculty.getDesignation());
                    System.out.println("  • Fine Rate: Rs. 5 per day");
                } else if (member instanceof GuestMember) {
                    GuestMember guest = (GuestMember) member;
                    System.out.println("  • Guest Type: " + guest.getGuestType());
                    System.out.println("  • Membership Days: " + guest.getMembershipDays());
                    System.out.println("  • Fine Rate: Rs. 10 per day");
                }
                
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("✗ Member not found!");
        }
    }
    
    // Display library summary statistics
    public static void displayLibrarySummary(LibraryMember[] members) {
        System.out.println("╔════════════════ LIBRARY SUMMARY ═══════════════════════╗\n");
        
        int studentCount = 0;
        int facultyCount = 0;
        int guestCount = 0;
        int totalBooksIssued = 0;
        
        for (LibraryMember member : members) {
            if (member instanceof StudentMember) {
                studentCount++;
            } else if (member instanceof FacultyMember) {
                facultyCount++;
            } else if (member instanceof GuestMember) {
                guestCount++;
            }
            totalBooksIssued += member.getBooksIssued();
        }
        
        System.out.println("Membership Breakdown:");
        System.out.println("  • Student Members: " + studentCount);
        System.out.println("  • Faculty Members: " + facultyCount);
        System.out.println("  • Guest Members: " + guestCount);
        System.out.println("  • Total Members: " + members.length);
        
        System.out.println("\nLibrary Statistics:");
        System.out.println("  • Total Books Issued: " + totalBooksIssued);
        System.out.println("  • Average Books per Member: " + (totalBooksIssued / members.length));
        
        System.out.println("\nFine Rates by Membership Type:");
        System.out.println("  • Students: Rs. 2 per day");
        System.out.println("  • Faculty: Rs. 5 per day");
        System.out.println("  • Guests: Rs. 10 per day");
        
        System.out.println("\n╚═══════════════════════════════════════════════════════╝\n");
    }
}
