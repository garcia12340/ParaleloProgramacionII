/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.rupap.programacionii;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Sistemas08
 */
public class componentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ejercicio03 e03 = new ejercicio03();
    }

    private static class ejercicio03 {

        public ejercicio03() {
            //Instancia un objeto TextField y coloca una cadena como
            //Texto para que aparezca en el momento de la creación
            TextField miCampoTexto = new TextField("Texto inicial");
            
            /*Instancia y registra un receptor de eventos de tipo Action
            sobre el campo texto*/
            miCampoTexto.addActionListener(new MiActionListener(miCampoTexto));
            
            //Coloca el campo de texto sobre el objeto Frame
            Frame miFrame = new Frame( "Programacion II" );
            miFrame.setLayout(new FlowLayout());
            miFrame.add(miCampoTexto);
            miFrame.setSize(250,150);
            miFrame.setVisible(true);
            
            //Instancia y registra un objeto receptor de eventos de ventana
            // para concluir la ejecución del programa cuando el Frame se
            // cierre por acción del usuario sobre este
            miFrame.addWindowListener(new Conclusion());
        }
        
        // Clase para recibir los eventos de tipo Action que se produzcan
        // sobre el objeto TextField sobre el cual se encuentra registrado
        class MiActionListener implements ActionListener {
            TextField oCampoTexto;
            
            MiActionListener(TextField iCampoTexto){
                // Guarda una referencia al objeto Textfield
                oCampoTexto = iCampoTexto;
            }

            // Se sobrescribe el método actionPerformed() de la interfaz
            // ActionListener para que se indique en la consola el texto que
            // se introduce
            public void actionPerformed(ActionEvent e) {
                System.out.println("Texto seleccionado: "+oCampoTexto.getSelectedText());
                System.out.println("Texto completo: "+oCampoTexto.getText());
            }
        }
        
        class Conclusion extends WindowAdapter {
            public void windowClosing (WindowEvent evt) {
                //Concluye el programa cuando se cierra la ventana
                System.exit(0);
            }
        }
    }

        
}
