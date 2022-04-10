/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Laura
 */

/**
 * Declaración de la clase person 
 */
public class Person {

    private String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
/**
 * declaramos los atributos de la clase 
 * @return 
 */

    public String getName() {
        return name;
    }
/**
 * metodos get y set del atributo name para acceder a el 
 * @param name 
 */
    public void setName(String name) {
        this.name = name;
    }

  
}
