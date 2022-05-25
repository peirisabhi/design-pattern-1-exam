/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.impl;

/**
 *
 * @author abhis
 */
public class SDCard {

    String brand;
    int capacity;

    public SDCard(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    public SDCard() {
    }
    
    

    @Override
    public String toString() {
        return "SdCard{" + "brand=" + brand + ", capacity=" + capacity + '}';
    }

    String process() {
       return toString();
    }
    
}
