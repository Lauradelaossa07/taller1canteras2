/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Laura
 */

/**
 * Declaracion de la clase Plane
 */
public class Plane {

    private String name;
    public double weight;
    public int seating;
    private String color;
    protected boolean takeOff;

/**
 * Declaracion de los atributos.
 * @return 
 */
    
      public String getName() {
        return name;
    }

    public boolean isTakeOff() {
        return takeOff;
    }

    public void setTakeOff(boolean takeOff) {
        this.takeOff = takeOff;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

 /**
 * metodos get y set de los atributos.
 */ 
}
