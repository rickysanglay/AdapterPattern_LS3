// Adapter: translates integrateSystem() -> markAttendance()
public class AttendanceSystemAdapter implements SchoolManagementApp {
    private final AttendanceSystem attendanceSystem;
    private final String studentId;
    private final String section;

    public AttendanceSystemAdapter(AttendanceSystem attendanceSystem, String studentId, String section) {
        this.attendanceSystem = attendanceSystem;
        this.studentId = studentId;
        this.section = section;
    }

    @Override
    public void integrateSystem() {
        System.out.println("Integrating attendance system...");
        attendanceSystem.markAttendance(studentId, section);
    }
}