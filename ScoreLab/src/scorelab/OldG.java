/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scorelab;

/**
 *
 * @author Thorny
 */
public class OldG implements MyObserver{
    @Override
    public void update(Source o) {
        System.out.println(
	 "(OldG) Result " + 
                ((Storage)o).getSomeData());
    }
}
