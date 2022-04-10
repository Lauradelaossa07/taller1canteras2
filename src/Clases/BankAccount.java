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
 * Declaracion de la clase BankAccount
 */
public class BankAccount {
    private int accountNumber;
    protected boolean activated;

/**
 * Declaracion de los atributos.
 * @return 
 */
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

/**
 * metodos get y set de los atributos.
 */ 
}
