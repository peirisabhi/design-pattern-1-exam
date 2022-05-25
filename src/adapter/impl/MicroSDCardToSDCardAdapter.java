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
public class MicroSDCardToSDCardAdapter extends SDCard {

    MicroSDCard microSDCard;

    public void setMicroSDCard(MicroSDCard microSDCard) {
        this.microSDCard = microSDCard;
    }

    @Override
    String process() {
        return microSDCard.process();
    }

}
