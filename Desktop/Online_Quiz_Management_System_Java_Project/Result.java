public class Result {
     public Result(){
        MultipleChoiceQuestion g=new MultipleChoiceQuestion();
        TrueFalseQuestion t=new TrueFalseQuestion();
        g.checkAnswers();
        t.checkAnswers();
        System.out.println(g);
        System.out.println(t);
        double final_mark= ((((double) g.numCorrect/g.questionSet.size())+ ((double) t.numCorrect/t.questionSet.size()))/2)*100;
        System.out.println("----------------------\nYour Final average mark is "+final_mark+"%");
    }
}
