package scoreusingbound;

import java.util.Scanner;

public class ScoreUsingBound {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Subscriber oldG = new Subscriber();
        Subscriber fnatic = new Subscriber();
        ScoreEvent scoreevent = new ScoreEvent();
        
        scoreevent.addPropertyChangeListener(oldG);
        scoreevent.addPropertyChangeListener(fnatic);

        String line;
        do
        {
            System.out.print("Enter Score ");
            line = in.nextLine();
            if(line.length() > 0)
            {
                scoreevent.setScoreLine(line);
            }
        } 
        while(line.length() > 0);
    }
    
}
