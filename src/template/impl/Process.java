/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.impl;

/**
 *
 * @author abhis
 */
abstract class Process {
    
    public String addIngredients(){
        return "Adding Ingredients";
    }
    
    public String bake(){
        return "Baking";
    }
    
    public abstract String mainIngredient();
    
    public String addSpice(String spiceLevel){
        return spiceLevel+" added";
    }
    
    public final String maker(String spiceLevel){
        String s=addIngredients();
        s=s+"\n"+bake();
        s=s+"\n"+mainIngredient();
        s=s+"\n"+addSpice(spiceLevel);
        s=s+"\n"+"Your pizza is ready";
        return s;
    }
    
}
