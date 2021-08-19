/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.rupap.programacionii;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Sistemas03
 */
public class Conclucion {
     public static class Conclusion extends WindowAdapter {

        public void windowClosing(WindowEvent evt) {
            //Concluye el programa cuando se cierra la ventana
            System.exit(0);
        }
    }
}
