import java.util.Scanner;
public class Login {
    // Hardcoded list of users for demonstration purposes
    private final User[] users = {
            new User("kln2020", "abc123"),
            new User("ps2020", "def456")
    };


    public User authenticate() {
        Scanner scanner = new Scanner(System.in);
        boolean isAuthenticated = false;
        User user = null;
        while (!isAuthenticated) {
            System.out.println("Please enter your username:");
            String username = scanner.nextLine();
            System.out.println("Please enter your password:");
            String password = scanner.nextLine();
            for (User u : users) {
                if (u.getUsername().equals(username) &&
                        u.getPassword().equals(password)) {
                    user = u;
                    isAuthenticated = true;
                    break;
                }
            }
            if (!isAuthenticated) {
                System.out.println("Invalid username or password. Please try again.");
            }
        }
        return user;
    }
}