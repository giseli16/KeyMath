/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teclado;

/**
 *
 * @author giselle
 */
public class Termino {
    private int coef;
    private String variable;
    private int exp;

    public Termino() {
    }
    
    

    public Termino(int coef, String variable, int exp) {
        this.coef = coef;
        this.variable = variable;
        this.exp = exp;
    }

    public int getCoef() {
        return coef;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    
    
    
    
    
}
