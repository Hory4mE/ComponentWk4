/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scorelab;

import java.util.Scanner;

/**
 *
 * @author Thorny
 */
public class ScoreLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fnatic obs1 = new Fnatic();
        OldG obs2 = new OldG();
        Storage str = new Storage();
        str.register(obs1);
        str.register(obs2);
        System.out.print("Enter Score : ");
        String inp;
        while(true){
            inp = sc.nextLine();
            if(inp.equals("")){
                break;
            }else{
                str.setSomeData(inp);
            }
        }
        
    }
    
}
