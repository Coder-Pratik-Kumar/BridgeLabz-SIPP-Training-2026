public class Course {
    private String courseName;
    private int duration; // in hours/weeks as needed
    private double fee;
    private static String instituteName = "Default Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Details:");
        System.out.println("Institute: " + instituteName);
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println();
    }

    public static void updateInstituteName(String name) {
        instituteName = name;
    }
}
