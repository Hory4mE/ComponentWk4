package scoreusingbound;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Subscriber implements PropertyChangeListener
{

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("live result: "+evt.getNewValue());
    }
    
}
