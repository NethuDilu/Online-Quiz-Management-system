import java.util.Scanner;
public class Rule {
    private final String rules = "Welcome to the quiz! Please read and agree to the following rules:\n\n" +
            "1. You will have 1 minute to complete the quiz.\n" +
            "2. You may not use any external resources during the quiz.\n" +
            "3. You may not collaborate with other individuals during the quiz.\n" +
            "4. You may not attempt to cheat or plagiarize in any way.\n\n" +"Do you agree to these rules? (yes/no)";
    public void showRules() {
        System.out.println(rules);
    }
    public boolean agreeToRules(User user) {
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }
}
