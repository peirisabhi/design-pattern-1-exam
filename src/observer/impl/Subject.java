/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.impl;

import java.util.ArrayList;

/**
 *
 * @author abhis
 */
public class Subject {
    ArrayList<Observe> observes = new ArrayList<>();
    public ArrayList<String> strings = new ArrayList<>();
    
    public void add(Observe observe) {
        observes.add(observe);
    }

    public void remove(Observe observe) {
        observes.remove(observe);
    }
    
    public void notify(String value){
        for (Observe observe : observes) {
            strings.add(observe.update(value));
        }
    }

    public ArrayList<Observe> getObserves() {
        return observes;
    }
    
    
}
