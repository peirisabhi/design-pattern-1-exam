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
public class MicroSDCard {

    private final String brand;
    private final int capacity;

    public MicroSDCard(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "MicroSdCard{" + "brand=" + brand + ", capacity=" + capacity + '}';
    }

    String process() {
       return toString();
    }
    
}
