
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sistemas17
 */
public class Conclusion extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent evt) {
        // Concluye el programa cuando se cierra la ventana
        System.exit(0);
    }
}
