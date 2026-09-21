// Adapter: translates integrateSystem() -> manageBooks()
public class LibrarySystemAdapter implements SchoolManagementApp {
    private final LibrarySystem librarySystem;
    private final String action;
    private final String title;

    public LibrarySystemAdapter(LibrarySystem librarySystem, String action, String title) {
        this.librarySystem = librarySystem;
        this.action = action;
        this.title = title;
    }

    @Override
    public void integrateSystem() {
        System.out.println("Integrating library system...");
        librarySystem.manageBooks(action, title);
    }
}