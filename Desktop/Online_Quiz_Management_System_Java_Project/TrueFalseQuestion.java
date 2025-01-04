import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TrueFalseQuestion extends Question{


    public TrueFalseQuestion(){
        //super();

        questionSet=new ArrayList<Quiz>();
        String q="Constructor overloading is not possible in java.";
        String[] a={"True","False"};
        questionSet.add(new Quiz(q,a,"False"));
        q="Assignment operator is evaluated Left toRight.";
        //must reuse variable with new a string[]
        a=new String[]{"True","False"};
        questionSet.add(new Quiz(q,a,"False"));
        q="In an instance method or a constructor,\"this\"is a reference to the current object";
        //must reuse variable with new a string[]
        a=new String[]{"True","False"};
        questionSet.add(new Quiz(q,a,"True"));
        Collections.shuffle(questionSet,new Random());

    }
    public void checkAnswers() {
        super.start();
    }
    @Override
    public String toString() {
        return "Your Results for True False Questions\n---------------------\nYou have got "+numCorrect+" correct Answers "+"\n"+"You have got "+(questionSet.size()-numCorrect)+" Incorrect answers\nyour grade is "+(((double)numCorrect/questionSet.size())*100)+"%";
    }
}
