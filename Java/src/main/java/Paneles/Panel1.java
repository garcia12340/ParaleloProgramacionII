package vista.paneles;


import controlador.Coordinador;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sistemas08
 */
public class Panel1 extends JPanel {
    
    JTextArea textArea;
    
    Coordinador miCoordinador;
    
    public Panel1(){
        setLayout(null);
        setBackground(Color.GREEN);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        textArea = new JTextArea();
        textArea.setBounds(10, 10, 350, 181);
        String texto = "Esto es un Ejemplo Simple del uso de JPanel en una misma "
                + "\nVentana, la lógica se basa en tener cada panel con sus \n"
                + "propios componentes y ocultar o hacer visibles uno de ellos "
                + "\ndependiendo de la necesidad.";
        textArea.setText(texto);
        add(textArea);
    }

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }
}
