
import controlador.Coordinador;
import modelo.Logica;
import vista.paneles.Panel1;
import vista.paneles.Panel2;
import vista.ventanas.VentanaPrincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sistemas08
 */
public class Principal {
    
    public static void main(String[] args){
        Coordinador miCoordinador = new Coordinador();
        Panel1 miPanel1 = new Panel1();
        Panel2 miPanel2 = new Panel2();
        Logica miLogica = new Logica();
        VentanaPrincipal miVentana = new VentanaPrincipal();
        
        miPanel1.setCoordinador(miCoordinador);
        miPanel2.setCoordinador(miCoordinador);
        miLogica.setCoordinador(miCoordinador);
        miVentana.setCoordinador(miCoordinador);
        
        miCoordinador.setPanel1(miPanel1);
        miCoordinador.setPanel2(miPanel2);
        miCoordinador.setLogica(miLogica);
        miCoordinador.setVentanaPrincipal(miVentana);
        
        miVentana.setVisible(true);
    }
    
}
