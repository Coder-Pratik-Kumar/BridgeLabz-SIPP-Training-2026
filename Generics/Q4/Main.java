import java.util.*;

abstract class CourseType {

    protected String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public abstract void display();
}

class ExamCourse extends CourseType {

    public ExamCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void display() {
        System.out.println("Exam Based Course: " + courseName);
    }
}

class AssignmentCourse extends CourseType {

    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void display() {
        System.out.println("Assignment Based Course: " + courseName);
    }
}

class ResearchCourse extends CourseType {

    public ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void display() {
        System.out.println("Research Based Course: " + courseName);
    }
}

class Course<T extends CourseType> {

    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }
}

class CourseUtility {

    public static void displayCourses(List<? extends CourseType> list) {

        for (CourseType course : list) {
            course.display();
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Data Structures"));
        examCourses.addCourse(new ExamCourse("Operating Systems"));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("Web Development"));
        assignmentCourses.addCourse(new AssignmentCourse("Java Programming"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("Artificial Intelligence"));
        researchCourses.addCourse(new ResearchCourse("Machine Learning"));

        System.out.println("Exam Courses:");
        CourseUtility.displayCourses(examCourses.getCourses());

        System.out.println();

        System.out.println("Assignment Courses:");
        CourseUtility.displayCourses(assignmentCourses.getCourses());

        System.out.println();

        System.out.println("Research Courses:");
        CourseUtility.displayCourses(researchCourses.getCourses());
    }
}