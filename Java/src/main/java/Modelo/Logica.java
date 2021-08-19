/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.Coordinador;

/**
 *
 * @author Sistemas08
 */
public class Logica {
    Coordinador miCoordinador;
    
    public int sumar(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        
        return (n1 + n2);
    }

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }
    
}
