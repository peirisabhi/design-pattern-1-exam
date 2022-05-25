/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.impl;

/**
 *
 * @author abhis
 */
public class Contact implements Observe {

    String message;
    String name;
    Subject subject;

    public Contact(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public String update(String s) {
        this.message = s;
        return name + " - got a new message : " + this.message;
    }

    public String getName() {
        return name;
    }

    
}
