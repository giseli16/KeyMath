/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetica;

import TipoNumero.Real;

/**
 *
 * @author ricardo
 */
public class OperacionesBasicas implements Operaciones
{

    @Override
    public Object suma(Object a, Object b) {
        return ((Real)a).getNumero() + ((Real)b).getNumero();
    }

    @Override
    public Object multiplicacion(Object a, Object b) {
        return ((Real)a).getNumero() * ((Real)b).getNumero();
    }

    @Override
    public Object division(Object a, Object b) {
        return ((Real)a).getNumero() / ((Real)b).getNumero();
    }

    @Override
    public Object exponente(Object a, double b) {
        return Math.pow(((Real)a).getNumero(), b);
    }

    @Override
    public Object raiz(Object a, int b) {
        return Math.pow(((Real)a).getNumero(), (1 / b));
    }
    
    
}
