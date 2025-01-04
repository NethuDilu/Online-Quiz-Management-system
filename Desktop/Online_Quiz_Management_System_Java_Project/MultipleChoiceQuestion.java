import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MultipleChoiceQuestion extends Question {
    public MultipleChoiceQuestion(){
      //  super();
        questionSet=new ArrayList<Quiz>();
        String q="_____ is a Keyword";
        String[] a={"Final","String","Finally","Finalize"};
        questionSet.add(new Quiz(q,a,"Final"));
        q="Which of the following is not a Java Feature?";
        //must reuse variable with new a string[]
        a=new String[]{"Dynamic","Architecture Neutral","Use of pointers","Object-oriented"};
        questionSet.add(new Quiz(q,a,"Use of pointers"));
        q="In which memory a String is stored, when we create a string using new operator?";
        //must reuse variable with new a string[]
        a=new String[]{"Stack","String Memory","Heap memory","Random storage space"};
        questionSet.add(new Quiz(q,a,"Heap memory"));
        Collections.shuffle(questionSet,new Random());

    }
    public void checkAnswers(){
        super.start();
    }
   public String toString() {
       return "Your  Results for MultipleChoice Questions\n------------------------\nYou have got "+super.numCorrect+" correct Answers "+"\n"+"You have got "+(questionSet.size()-super.numCorrect)+" Incorrect answers\nyour grade is "+(((double)super.numCorrect/questionSet.size())*100)+"%\n----------------------";
   }
}
