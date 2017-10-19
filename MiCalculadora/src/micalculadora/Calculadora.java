/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package micalculadora;

/**
 *
 * @author Andres
 */
class Calculadora {
    
    private Float ultimoResultado;
    
    
    public Float sumar(Float operandoUno, Float operandoDos){
        
        ultimoResultado=operandoDos+operandoUno;
        return ultimoResultado;
        
    }
    
}
