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
 * Declaracion de la clase Figures
 */
public class Figures {
    private String name;
    private int numberofSides;
    public float area;
    public float perimetro;

/**
 * Declaracion de los atributos.
 * @return 
 */
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getNumberofSides() {
        return numberofSides;
    }

    public void setNumberofSides(int numberofSides) {
        this.numberofSides = numberofSides;
    }

 /**
 * metodos get y set de los atributos de tipo private.
 */ 
}
