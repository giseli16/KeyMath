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
    // Metodos Implementados de la interfaz
    @Override
    public double suma(double a, double b) {
        return a + b;
    }

    @Override
    public double multiplicacion(double a, double b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        return a / b;
    }

    @Override
    public double exponente(double a, double b) {
        return Math.pow(a, b);
    }

    @Override
    public double raiz(double a, int b) {
        return Math.pow( a , (1 / b));
    }
    
    // Metodos Sobrecargados
    // Real - Real
    public Real suma(Real a, Real b)
    {
        double real = ((Real)a).getReal() + ((Real)b).getReal();
        return new Real(real);
    }
    
    public Real multiplicacion(Real a, Real b)
    {
        double real = ((Real)a).getReal() * ((Real)b).getReal();
        return new Real(real);
    }
    
    public Real division(Real a, Real b)
    {
        double real = a.getReal() / b.getReal();
        return new Real(real);
    }
    
    public Real exponente(Real a, Real b){
        double real = Math.pow(a.getReal(), b.getReal());
        return new Real(real);
    }
    
    public Real raiz(Real a, Real b){
        double real = Math.pow(a.getReal(), 1 / b.getReal());
        return new Real(real);
    }
    
    // Complejo - Complejo
    public Complejo suma(Complejo a, Complejo b){
        
        double real = a.getReal() + b.getReal();
        double imaginario = a.getImaginario() + b.getImaginario();
            
        return new Complejo(real, imaginario);
    }
    
    
    
    
    ///////////////// CODIGO MALO ////////////////////////////
    //////////////////////////////////////////////////////////
    public Object suma(Object a, Object b) 
    {
        if((a instanceof Real) && (b instanceof Real))
        {
            double real = ((Real)a).getReal() + ((Real)b).getReal();
            
            return new Real(real);
        }
        
        if((a instanceof Complejo) && (b instanceof Complejo))
        {
            double real = ((Complejo)a).getReal() + ((Complejo)b).getReal();
            double imaginario = ((Complejo)a).getImaginario() + ((Complejo)b).getImaginario();
            
            return new Complejo(real, imaginario);
        }
        
        
        if((a instanceof Real) && (b instanceof Complejo))
        {
            double real =  ((Real)a).getReal() + ((Real)b).getReal();
            double complejo = ((Complejo)a).getImaginario();
            
            return new Complejo(real, complejo);
        }
        
        if((a instanceof Complejo) && (b instanceof Real))
        {
            double real =  ((Real)a).getReal() + ((Real)b).getReal();
            double complejo = ((Complejo)a).getImaginario();
            
            return new Complejo(real, complejo);
        }
        
        
        return false;
    }

    // Formula de multiplicacion complejos
    // (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
    public Object multiplicacion(Object a, Object b)
    {  
        if((a instanceof Real) && (b instanceof Real))
        {
            double real = ((Real)a).getReal() * ((Real)b).getReal();
            return new Real(real);
        }
        
        if((a instanceof Real) && (b instanceof Complejo))
        {
            // solamente se multiplica la parte real
            // (ac - bd) pero bd = 0 porque b= 0
            double real = (((Real)a).getReal()*((Complejo)b).getReal());
            
            // (ad + bc)i
            // se anula bc porque b=0
            double imaginario = (((Real)a).getReal()*((Complejo)b).getImaginario());
            
            return new Complejo(real, imaginario);
        }
        
        // (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
        if((a instanceof Complejo) && (b instanceof Real))
        {
            // (ac - bd)
            // bd = 0 porque d = 0
            double real = (((Complejo)a).getReal()*((Real)b).getReal());
            
            // (ad + bc)i
            // ad = 0 porque d = 0
            double imaginario = ((Complejo)a).getImaginario() * ((Real)b).getReal();
            
            return new Complejo(real, imaginario);
        }
        
        if((a instanceof Complejo) && (b instanceof Complejo))
        {
            double real = (((Complejo)a).getReal() * ((Complejo)b).getReal()) - (((Complejo)a).getImaginario() * ((Complejo)b).getImaginario());
            double imaginario = (((Complejo)a).getReal() * ((Complejo)b).getImaginario()) + ( ((Complejo)a).getImaginario() * ((Complejo)b).getReal() );
            
            return new Complejo(real, imaginario);
        }
        
        return false;
    }

    public Object division(Object a, Object b) {
        
        if((a instanceof Real) && (b instanceof Real))
        {
            double real = ((Real)a).getReal() / ((Real)b).getReal();
            return new Real(real);
        }
        
        if((a instanceof Complejo) && (b instanceof Complejo))
        {
            double Rnumerador = (((Complejo)a).getReal() * ((Complejo)b).getReal()) + ( ((Complejo)a).getImaginario() * ((Complejo)b).getImaginario());
            double denominador = ( Math.pow( ((Complejo)b).getReal(), 2 ) + Math.pow(((Complejo)b).getImaginario(), 2));
            
            double ParteReal = Rnumerador / denominador;
            
            double imgNumerador = ( (((Complejo)a).getImaginario() * ((Complejo)b).getReal()) - ( ((Complejo)a).getReal() * ((Complejo)b).getImaginario()) );
            
            double parteImg = imgNumerador / denominador;
            
            return new Complejo(ParteReal, parteImg);
        }
        return false;
    }

    
    
}
