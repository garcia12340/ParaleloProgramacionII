package vista.ventanas;


import controlador.Coordinador;
import vista.paneles.Panel2;
import vista.paneles.Panel1;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sistemas08
 */
public class VentanaPrincipal extends JFrame implements ActionListener {

    JLabel lblTitulo;
    JButton btnPanel1, btnPanel2;
    
    Panel1 miPanel1;
    Panel2 miPanel2;
    JScrollPane scrollPaneles;
    
    Coordinador miCoordinador;
    
    public VentanaPrincipal(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(387, 365);
        setTitle("EJEMPLO JPANEL BÁSICO");
        setLayout(null);
        
        setLocationRelativeTo(null);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        miPanel1 = new Panel1();
        miPanel2 = new Panel2();
        
        scrollPaneles = new JScrollPane();
        scrollPaneles.setBounds(5, 112, 360, 200);
        
        lblTitulo = new JLabel("Ejemplo JPanel");
        lblTitulo.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 30));
        lblTitulo.setBounds(10, 14, 221, 51);
        
        btnPanel1 = new JButton("Panel 1");
        btnPanel1.setBounds(10, 76, 89, 23);
        btnPanel1.addActionListener(this);
        
        btnPanel2 = new JButton("Panel 2");
        btnPanel2.setBounds(109, 76, 89, 23);
        btnPanel2.addActionListener(this);
        
        add(btnPanel2);
        add(btnPanel1);
        add(lblTitulo);
        add(scrollPaneles);
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnPanel1){
            miCoordinador.cargarPanel(1);
        }
        if(e.getSource() == btnPanel2) {
            miCoordinador.cargarPanel(2);
        }
    }

    public void definirPanel(Panel1 miPanel) {
        scrollPaneles.setViewportView(miPanel);
    }

    public void definirPanel(Panel2 miPanel) {
        scrollPaneles.setViewportView(miPanel);
    }

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }

}
