/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scorelab;

import java.util.ArrayList;

/**
 *
 * @author Thorny
 */
public class Storage implements Source{
    private final ArrayList<MyObserver> list;
    private String newdata;
    
    public Storage(){
        this.list = new ArrayList<MyObserver>();
    }
    public void setSomeData(String aData) {
	newdata = aData;
	notifyObservers();
    }
    public String getSomeData() {
	return newdata;
    }
    @Override
    public void register (MyObserver observer) {
        list.add(observer);
    }
    @Override
    public void notifyObservers() {
        for (int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
	}
    }
}
