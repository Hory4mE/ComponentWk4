package scoreusingevent;

import java.util.EventObject;

public class ScoreEvent extends EventObject{
    
    private String scoreLine;
    
    public String getScoreLine()
    {
        return scoreLine;
    }
    
    public ScoreEvent(Object source, String value)
    {
        super(source);
        scoreLine = value;
    }
    
}
