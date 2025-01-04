import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question {
    public ArrayList<Quiz> questionSet;
    int numCorrect=0;
    public ArrayList<Quiz> getQuestionSet() {
        return questionSet;
    }
    public void start() {
        Scanner scan = new Scanner(System.in);
        //show questions from question set
        for (int question = 0; question < questionSet.size(); question++) {
            System.out.println(questionSet.get(question).getQuestion());
            int numChoices = questionSet.get(question).getChoices().size();
            //show choices from questions in question
            for (int choice = 0; choice < numChoices; choice++) {
                System.out.println((choice + 1) + ":" + questionSet.get(question).getChoices().get(choice));
            }
            // get player answer and validate input
            int playerAnswer = 0;
            boolean validInput = false;
            while (!validInput) {
                try {
                    playerAnswer = scan.nextInt();
                    if (playerAnswer < 1 || playerAnswer > numChoices) {
                        System.out.println("Invalid input. Please enter a number between 1 and " + numChoices + ".");
                    } else {
                        validInput = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scan.next(); // consume the invalid input
                }
            }
            ArrayList<String> choiceSet = questionSet.get(question).getChoices();
            String correctAnswer = questionSet.get(question).getAnswer();
            int correctAnswerIndex = choiceSet.indexOf(correctAnswer);
            if (playerAnswer == correctAnswerIndex + 1) {
                numCorrect++;
            }
        }
    }
}
