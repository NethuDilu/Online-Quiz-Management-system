import java.util.ArrayList;
import java.util.Collections;

public class Quiz {
    private  String name;
    private  int duration;
    private String question;
    private ArrayList<String> choices;
    private String answer;
    public Quiz(String name, int duration){
        this.name=name;
        this.duration=duration;
    }
    public Quiz(String question,String[] choices,String answer){
        this.question=question;
        this.choices=new ArrayList<String>();
        for (int i=0;i<choices.length;i++){
            this.choices.add(choices[i]);
        }
        //make sure each game shows questions imn different order
        Collections.shuffle(this.choices);
        this.answer=answer;
    }
    public void take(User user) {
        System.out.println("\n//--------------//");
        System.out.print("Welcome ");
        System.out.println(user.getName()+"!");
        System.out.print("You have ");
        Time x=new Time();
        System.out.print(x.takeDuration());
        System.out.println(" seconds to complete the quiz.");
        System.out.println("Starting quiz: " +name);
        System.out.println("//-------------//\n");
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public String getAnswer() {
        return answer;
    }

    public int getDuration() {
        return duration;
    }
}
