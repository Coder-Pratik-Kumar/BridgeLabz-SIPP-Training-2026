public class UniversityHierarchyMain {
    public static void main(String[] args) {
        GradStudent gradStudent = new GradStudent("Maya Patel", 26, "G12345", 3.9, "Renewable Energy Optimization");

        Person personRef = gradStudent; // GradStudent IS-A Person
        Student studentRef = gradStudent; // GradStudent IS-A Student

        System.out.println("=== University Hierarchy ===");
        System.out.println(personRef);
        System.out.println(studentRef);
        System.out.println(gradStudent);

        System.out.println();
        System.out.println("Demonstrating IS-A relationships:");
        System.out.println("personRef instanceof Person -> " + (personRef instanceof Person));
        System.out.println("personRef instanceof Student -> " + (personRef instanceof Student));
        System.out.println("personRef instanceof GradStudent -> " + (personRef instanceof GradStudent));
        System.out.println("studentRef instanceof Person -> " + (studentRef instanceof Person));
        System.out.println("studentRef instanceof GradStudent -> " + (studentRef instanceof GradStudent));
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

class Student extends Person {
    private final String studentId;
    private double gpa;

    public Student(String name, int age, String studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId='" + studentId + "', gpa=" + gpa + ", " + super.toString() + '}';
    }
}

class GradStudent extends Student {
    private String thesisTitle;

    public GradStudent(String name, int age, String studentId, double gpa, String thesisTitle) {
        super(name, age, studentId, gpa);
        this.thesisTitle = thesisTitle;
    }

    @Override
    public String toString() {
        return "GradStudent{" + "thesisTitle='" + thesisTitle + "', " + super.toString() + '}';
    }
}
