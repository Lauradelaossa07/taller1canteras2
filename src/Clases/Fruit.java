/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Laura
 */
public class Fruit {

/**
 * Declaracion de la clase Fruit
 */
    public String name;
    private float averageWeight;
    private ArrayList <String> colors;
/**
 * Declaracion de los atributos.
 * @return 
 */

    public float getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
/**
 * metodos get y set de los atributos de tipo private.
 */    

}
