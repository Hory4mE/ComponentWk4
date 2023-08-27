package scoreusingevent;

import java.util.EventListener;

public interface ScoreListener extends EventListener{
    public void scoreChange(ScoreEvent evt);
}
