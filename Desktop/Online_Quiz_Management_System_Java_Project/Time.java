import javax.swing.Timer;
import java.util.TimerTask;

public class Time {

    private int timeRemaining,duration;


    public int takeDuration(){
        Quiz object =new Quiz("Java Quiz",60);
        duration=object.getDuration();
        return duration;
    }
    public void startTime(){
        timeRemaining =takeDuration() ;
        // Set up a timer to track the time remaining for the quiz
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                timeRemaining--;
                if (timeRemaining == 0) {
                    timer.cancel();
                    System.out.println("Time's up! Quiz submitted.");
                }
            }
        }, 0, 1000); // Update the timer every second
    }
    public void TimeTaken(){
        System.out.println("Time Taken : "+(duration-timeRemaining)+" seconds");

    }
}
