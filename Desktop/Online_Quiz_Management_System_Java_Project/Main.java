public class Main {
    public static void main(String[] args) {
        // Authenticate the user
        Login login = new Login();
        User user = login.authenticate();
        if (user != null) {
            // Show the quiz rules and conditions
            Rule rule = new Rule();
            rule.showRules();
            // Check if the user agrees to the rules
            if (rule.agreeToRules(user)) {
                Quiz quiz = new Quiz("Java Quiz", 60);
                Time disptime = new Time();
                //start the time
                disptime.startTime();
                //Take the quiz
                quiz.take(user);
                //Display the result
                Result obj=new Result();
                // Display time taken
                disptime.TimeTaken();
            } else {
                // User did not agree to the rules
                System.out.println("You must agree to the rules to take the quiz.");
            }
        } else {
            // Authentication failed
            System.out.println("Invalid username or password.");
        }
    }
}
