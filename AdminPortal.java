import java.util.List;

// Client: uses all systems only through the SchoolManagementApp interface
public class AdminPortal {
    public static void main(String[] args) {
        List<SchoolManagementApp> systems = List.of(
                new AttendanceSystemAdapter(new AttendanceSystem()),
                new GradingSystemAdapter(new GradingSystem()),
                new LibrarySystemAdapter(new LibrarySystem())
        );

        for (SchoolManagementApp system : systems) {
            system.integrateSystem();
        }
    }
}