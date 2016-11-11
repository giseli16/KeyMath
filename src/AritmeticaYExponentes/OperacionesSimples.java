/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AritmeticaYExponentes;

import static java.lang.Math.pow;

/**
 *
 * @author ricardo
 */
public class OperacionesSimples implements Operaciones {
    //Aquí se van a poner las operaciones básicas para los números reales
    
    private double num1;
    private double num2;

    public OperacionesSimples(Object num1, Object num2) {
        this.num1 = (double)num1;
        this.num2 = (double)num2;
    }
    
    
    

    @Override
    public Object suma(Object a, Object b) {
         this.num1= (double)a;
         this.num2= (double)b;
         
         return num1+num2;
    }

    @Override
    public Object multiplicacion(Object a, Object b) {
         this.num1= (double)a;
         this.num2= (double)b;
         
         return num1*num2;
       
    }

    @Override
    public Object division(Object a, Object b) {
        this.num1= (double)a;
        this.num2= (double)b;
         
        return num1/num2;
        //Falta poner un try catch
    }

    @Override
    public Object exponente(Object a, double b) {
        this.num1= (double)a;
        this.num2= (double)b;
         
        return pow(num1, num2);
    }

    @Override
    public Object raiz(Object a, Object b) {
        this.num1= (double)a;
        this.num2= (double)(1/(double)b);
         
        return pow(num1, num2);
        
    }
    
    public Object alCuadrado(Object a){
        this.num1= (double)a;
        
        return pow(num1,2);
        
        
    }
    
    public Object raizCuadrada(Object a){
        this.num1= (double)a;
        
        return pow(num1,1/2);
        
    }
   
    
    
    
}
