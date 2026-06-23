public class PostgraduateStudent extends Student {
    private String researchArea;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String researchArea) {
        super(rollNumber, name, cgpa);
        this.researchArea = researchArea;
    }

    public void displayWithResearch() {
        // can access protected 'name' from superclass
        System.out.println("Postgraduate Student:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name (protected): " + name);
        System.out.println("Research Area: " + researchArea);
        System.out.println("CGPA (via getter): " + getCgpa());
        System.out.println();
    }
}
