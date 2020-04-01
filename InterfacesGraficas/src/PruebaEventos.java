import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaEventos extends JPanel  {

    JButton botonAzul = new JButton("Azul");
    JButton botonVerde = new JButton("Verde");
    JButton botonRojo = new JButton("Rojo");

    public PruebaEventos(){
        add(botonAzul);
        add(botonVerde);
        add(botonRojo);
        ColorFondo azul = new ColorFondo(Color.BLUE);
        ColorFondo verde = new ColorFondo(Color.GREEN);
        ColorFondo rojo = new ColorFondo(Color.RED);
        botonAzul.addActionListener(azul);
        botonVerde.addActionListener(verde);
        botonRojo.addActionListener(rojo);
    }

    private class ColorFondo implements ActionListener{

        private Color color;

        public ColorFondo(Color c){
            color = c;
        }

        public void actionPerformed(ActionEvent e){
            setBackground(color);
        }

    }


}
