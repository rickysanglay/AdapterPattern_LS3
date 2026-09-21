// Adapter: translates integrateSystem() -> recordGrades()
public class GradingSystemAdapter implements SchoolManagementApp {
    private final GradingSystem gradingSystem;
    private final String courseCode;
    private final double grade;

    public GradingSystemAdapter(GradingSystem gradingSystem, String courseCode, double grade) {
        this.gradingSystem = gradingSystem;
        this.courseCode = courseCode;
        this.grade = grade;
    }

    @Override
    public void integrateSystem() {
        System.out.println("Integrating grading system...");
        gradingSystem.recordGrades(courseCode, grade);
    }
}