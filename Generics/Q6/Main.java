import java.util.*;

abstract class JobRole {

    protected String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    public abstract void evaluate();
}

class SoftwareEngineer extends JobRole {

    public SoftwareEngineer(String candidateName) {
        super(candidateName);
    }

    @Override
    public void evaluate() {
        System.out.println(candidateName +
                " shortlisted for Software Engineer.");
    }
}

class DataScientist extends JobRole {

    public DataScientist(String candidateName) {
        super(candidateName);
    }

    @Override
    public void evaluate() {
        System.out.println(candidateName +
                " shortlisted for Data Scientist.");
    }
}

class ProductManager extends JobRole {

    public ProductManager(String candidateName) {
        super(candidateName);
    }

    @Override
    public void evaluate() {
        System.out.println(candidateName +
                " shortlisted for Product Manager.");
    }
}

class Resume<T extends JobRole> {

    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }
}

class ResumeProcessor {

    public static <T extends JobRole> void processResume(T role) {

        System.out.println("Processing Resume...");
        role.evaluate();
    }
}

class ScreeningPipeline {

    public static void screenCandidates(List<? extends JobRole> candidates) {

        for (JobRole candidate : candidates) {
            candidate.evaluate();
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Resume<SoftwareEngineer> seResume =
                new Resume<>(new SoftwareEngineer("Pratik"));

        Resume<DataScientist> dsResume =
                new Resume<>(new DataScientist("Rahul"));

        Resume<ProductManager> pmResume =
                new Resume<>(new ProductManager("Neha"));

        ResumeProcessor.processResume(seResume.getJobRole());
        ResumeProcessor.processResume(dsResume.getJobRole());
        ResumeProcessor.processResume(pmResume.getJobRole());

        System.out.println();

        List<JobRole> candidates = new ArrayList<>();

        candidates.add(seResume.getJobRole());
        candidates.add(dsResume.getJobRole());
        candidates.add(pmResume.getJobRole());

        System.out.println("Screening Pipeline:");

        ScreeningPipeline.screenCandidates(candidates);
    }
}