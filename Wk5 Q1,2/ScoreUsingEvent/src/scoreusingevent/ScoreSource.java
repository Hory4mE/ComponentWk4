package scoreusingevent;

import java.util.ArrayList;

public class ScoreSource {
    
    ArrayList<ScoreListener> observers;
    
    public ScoreSource(){
        observers = new ArrayList<>();
    }
    
    public void addObserver(ScoreListener obj){
        observers.add(obj);
    }
    
    public void removeObserver(ScoreListener obj){
        observers.remove(obj);
    }
    
public void setScoreLine(String value){
        fireHeadQuaterEvent(new ScoreEvent(this, value));
    }
    
    public void fireHeadQuaterEvent(ScoreEvent evt){
        
        for(ScoreListener observer : observers){
            observer.scoreChange(evt);
        }
    }
}
