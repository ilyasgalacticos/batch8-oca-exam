package oca.eventTask;

public class PracticeQuiz extends Quiz implements Event{
    public void details(){
        System.out.println(Event.type);
    }
}
