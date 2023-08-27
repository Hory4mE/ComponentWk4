package scoreusingevent;

import java.util.Scanner;

public class ScoreUsingEvent
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
   
        Subscriber fnatic = new Subscriber();
        Subscriber oldG = new Subscriber();
        Subscriber secret = new Subscriber();

        ScoreSource scoresource = new ScoreSource();
        
        scoresource.addObserver(fnatic);
        scoresource.addObserver(oldG);
        scoresource.addObserver(secret);
        
        scoresource.removeObserver(fnatic);

        String line;
        do{
            System.out.print("Enter Score ");
            line = in.nextLine();
            if(line.length() > 0){
                scoresource.setScoreLine(line);
            }
        } 
        while(line.length() > 0);
    }
}
