// Adaptee: existing library system with its own method
public class LibrarySystem {
    public void manageBooks(String action, String title) {
        if ("ADD".equalsIgnoreCase(action)) {
            System.out.println("Book '" + title + "' added to library inventory.");
        } else if ("REMOVE".equalsIgnoreCase(action)) {
            System.out.println("Book '" + title + "' removed from library inventory.");
        } else {
            System.out.println("Unknown library action for '" + title + "'.");
        }
    }
}