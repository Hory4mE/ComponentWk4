package scoreusingevent;

public class Subscriber implements ScoreListener{

    @Override
    public void scoreChange(ScoreEvent evt) {
        System.out.println("live result: "+evt.getScoreLine());
    }
    
}
