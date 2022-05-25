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
public class Laptop {
    private String brand;
    private String model;
    private SDCard sdCard;

    public Laptop(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void setSdCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }

   
    public String  readFiles(){
       return sdCard.process();
    }
}
