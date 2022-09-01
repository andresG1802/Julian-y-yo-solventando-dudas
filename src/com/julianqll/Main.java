package com.julianqll;
import javax.swing.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Ventana();
                frame.setSize(300,300);
                frame.setVisible(true);

            }
        });
    }
}
