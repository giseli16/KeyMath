/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetica;

import TipoNumero.*;

/**
 *
 * @author ricardo
 */
public class OperacionesBasicas implements Operaciones
{

    @Override
    public Object suma(Object a, Object b) {
        
        if((a instanceof Real) && (b instanceof Real)){
            double real = ((Real)a).getReal() + ((Real)b).getReal();
            
            return new Real(real);
        }
        
        if((a instanceof Complejo) && (b instanceof Complejo)){
            double real = ((Complejo)a).getReal() + ((Complejo)b).getReal();
            double imaginario = ((Complejo)a).getImaginario() + ((Complejo)b).getImaginario();
            
            return new Complejo(real, imaginario);
        }
        
        
        if((a instanceof Real) && (b instanceof Complejo)){
            double real =  ((Real)a).getReal() + ((Real)b).getReal();
            double complejo = ((Complejo)a).getImaginario();
            
            return new Complejo(real, complejo);
        }
        
        if((a instanceof Complejo) && (b instanceof Real)){
            double real =  ((Real)a).getReal() + ((Real)b).getReal();
            double complejo = ((Complejo)a).getImaginario();
            
            return new Complejo(real, complejo);
        }
        
        
        return false;
    }

    @Override
    public Object multiplicacion(Object a, Object b) {
        
        if((a instanceof Real) && (b instanceof Real)){
            double real = ((Real)a).getReal() * ((Real)b).getReal();
            return new Real(real);
        }
        return false;
    }

    @Override
    public Object division(Object a, Object b) {
        return ((Real)a).getReal() / ((Real)b).getReal();
    }

    @Override
    public Object exponente(Object a, double b) {
        return Math.pow(((Real)a).getReal(), b);
    }

    @Override
    public Object raiz(Object a, int b) {
        return Math.pow(((Real)a).getReal(), (1 / b));
    }
    
    
}
