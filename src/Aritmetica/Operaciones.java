/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetica;

/**
 *
 * @author ricardo
 */
public interface Operaciones 
{
    /*Los parámetros a recibir se definen como Object ya que se sumarán polinomios, complejos entre otros, es decir, no será de un sólo tipo.*/
    Object suma(Object a, Object b);
    Object multiplicacion(Object a, Object b);
    Object division(Object a, Object b); 
    Object exponente(Object a, double b);/*En el caso del exponente, siempre será un entero o una fracción, por lo que se define como double*/
    Object raiz(Object a, int b);
}
