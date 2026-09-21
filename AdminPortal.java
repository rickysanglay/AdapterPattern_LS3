import java.util.List;

// Client: uses all systems only through the SchoolManagementApp interface
public class AdminPortal {
    public static void main(String[] args) {
        List<SchoolManagementApp> systems = List.of(
                new AttendanceSystemAdapter(new AttendanceSystem(), "12345", "A"),
                new GradingSystemAdapter(new GradingSystem(), "CS101", 1.25),
                new LibrarySystemAdapter(new LibrarySystem(), "ADD", "Clean Code")
        );

        for (SchoolManagementApp system : systems) {
            system.integrateSystem();
        }
    }
}