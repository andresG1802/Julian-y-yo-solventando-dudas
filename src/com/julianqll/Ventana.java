package com.julianqll;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame{
    private JPanel panel1;
    private JTextField numero1Field;
    private JTextField numero2Field;
    private JLabel numero1Label;
    private JLabel numero2Label;
    private JButton sumarBoton;
    private JButton restarBoton;
    private JButton multiplicarBoton;
    private JButton dividirButton;

    public Ventana(){
        super("Ventana de suma");
        setContentPane(panel1);
        sumarBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float n1 = Float.parseFloat(numero1Field.getText());
                float n2 = Float.parseFloat(numero2Field.getText());
                Operaciones operacion = new Operaciones(n1,n2);
                JLabel jlabel = new JLabel(operacion.imprimirOperaciones());
                panel1.add(jlabel);
            }
        });
    }
}
