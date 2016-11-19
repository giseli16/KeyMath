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
public class TerminosPoli {
    private Termino term1;
    private String polinomioF="";

    public TerminosPoli() {
    }

    

    public String getPolinomioF() {
        return polinomioF;
    }
    
    
    
    
    public void agregarTermino(Termino term){
        term1= term;
        String terRecibido= ((Termino)term1).getCoef()+((Termino)term1).getVariable()+"^"+((Termino)term1).getExp();
        polinomioF= polinomioF+terRecibido;
    }
    
    public void agregarSuma(){
        polinomioF= polinomioF+" + ";
    }
    
    public void agregarResta(){
        polinomioF= polinomioF+" - ";
    }
    
    public String PolinomioR(){
        return polinomioF;
    }
    
    
    
    
}
