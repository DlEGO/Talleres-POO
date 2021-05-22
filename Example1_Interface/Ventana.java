package Example1_Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {
    private JTextField texto;
    private JLabel etiqueta;
    private JButton boton;

    public Ventana() {
        this.setSize(500,500);
        setLocationRelativeTo(null);
        texto = new JTextField("");
        etiqueta = new JLabel("");
        boton = new JButton("OK");
        this.setTitle("Mi ventana");
        this.getContentPane().setLayout(new GridLayout(6,40));
        this.getContentPane().add(texto);
        this.getContentPane().add(etiqueta);
        this.getContentPane().add(boton);

        boton.setActionCommand("OK");
        boton.addActionListener(this);
        boton.setBackground(Color.CYAN);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("OK")){
            etiqueta.setText(texto.getText());
        }
    }
}
