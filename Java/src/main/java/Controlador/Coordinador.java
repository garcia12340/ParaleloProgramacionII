/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Logica;
import vista.paneles.Panel1;
import vista.paneles.Panel2;
import vista.ventanas.VentanaPrincipal;

/**
 *
 * @author Sistemas08
 */
public class Coordinador {
    Panel1 miPanel1;
    Panel2 miPanel2;
    Logica miLogica;
    VentanaPrincipal miVentana;
    
    public int sumar(String num1, String num2) {
        return miLogica.sumar(num1, num2);
    }

    public void setPanel1(Panel1 miPanel1) {
        this.miPanel1 = miPanel1;
    }

    public void setPanel2(Panel2 miPanel2) {
        this.miPanel2 = miPanel2;
    }

    public void setLogica(Logica miLogica) {
        this.miLogica = miLogica;
    }

    public void setVentanaPrincipal(VentanaPrincipal miVentana) {
        this.miVentana = miVentana;
    }

    public void cargarPanel(int panel) {
        switch(panel){
            case 1:
                miVentana.definirPanel(miPanel1);
                break;
            case 2:
                miVentana.definirPanel(miPanel2);
                break;
            default:
                break;
        }
            
    }
}
