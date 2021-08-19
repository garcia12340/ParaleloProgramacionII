/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import uni.rupap.programacionii.Conclucion;

/**
 *
 * @author Sistemas03
 */
public class Calculadora extends Frame implements ActionListener, KeyListener {

    TextField pantalla = null;
    Button tecla = null;
    int operando1 = 0;
    int operando2 = 0;
    String operacion = null;
    boolean newDigitBlock = true;

    public Calculadora() {
        this.setTitle("Aplicacion Calculadora");
        this.setSize(200, 300);
        this.setLayout(new BorderLayout());
        this.addWindowListener(new Conclucion.Conclusion());

        //=== Display ===
        pantalla = new TextField();
        pantalla.setText("0");
        pantalla.addKeyListener(this);
        pantalla.setBackground(Color.cyan);
        this.add(pantalla, BorderLayout.NORTH);

        //=== Teclas ===
        Panel panel01 = new Panel();
        panel01.setLayout(new GridLayout(5, 3));
        tecla = new Button("");
        tecla.addActionListener(this);
        panel01.add(tecla);
        tecla = new Button("0");
        tecla.addActionListener(this);
        panel01.add(tecla);
        tecla = new Button("1");
        tecla.addActionListener(this);
        panel01.add(tecla);
        tecla = new Button("2");
        tecla.addActionListener(this);
        panel01.add(tecla);
        tecla = new Button("3");
        tecla.addActionListener(this);
        panel01.add(tecla);
        tecla = new Button("4");
        tecla.addActionListener(this);
        panel01.add(tecla);
        tecla = new Button("5");
        tecla.addActionListener(this);
        panel01.add(tecla);
        tecla = new Button("6");
        tecla.addActionListener(this);
        panel01.add(tecla);
        tecla = new Button("7");
        tecla.addActionListener(this);
        panel01.add(tecla);
        tecla = new Button("8");
        tecla.addActionListener(this);
        panel01.add(tecla);
        tecla = new Button("9");
        tecla.addActionListener(this);
        panel01.add(tecla);
        tecla = new Button("+");
        tecla.addActionListener(this);
        panel01.add(tecla);
        tecla = new Button("-");
        tecla.addActionListener(this);
        panel01.add(tecla);
        tecla = new Button("=");
        tecla.addActionListener(this);
        panel01.add(tecla);
        tecla = new Button("C");
        tecla.addActionListener(this);
        panel01.add(tecla);

        tecla.setEnabled(false);
        panel01.add(tecla);
        this.add(panel01, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String teclaPulsada = ((Button) e.getSource()).getLabel();

        if (teclaPulsada.equals("C")) {
            pantalla.setText("0");
            operando1 = 0;
            operando2 = 0;
            newDigitBlock = true;
        } else if (teclaPulsada.equals("=")){
        
            operando2 = Integer.parseInt(pantalla.getText());
            if(operacion != null) {
                if (operacion.equals("+")){
                    pantalla.setText(Integer.toString(operando1 + operando2));
                }else if (operacion.equals("-")){
                    pantalla.setText(Integer.toString(operando1 -operando2));
                }
            }
            newDigitBlock = true;
            operacion = null;
            
        }else if(teclaPulsada.equals("+") || teclaPulsada.equals("-")){
            operacion = teclaPulsada;
            operando1 = Integer.parseInt(pantalla.getText());
            newDigitBlock = true;
        }else{
            if(newDigitBlock == true){
                pantalla.setText(teclaPulsada);
                newDigitBlock = false;
            }else{
                pantalla.setText(pantalla.getText() + teclaPulsada);
                //--- Quitar 0 al principio ---
                if((pantalla.getText().length() > 1) && (pantalla.getText().charAt(0) == '0')){
                    pantalla.setText(pantalla.getText().substring(1));
                }
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
