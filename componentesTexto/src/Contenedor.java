import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Contenedor extends JPanel {

    private JTextField campo;

    public Contenedor(){
        JLabel texto = new JLabel("Email: ");
        add(texto);
        campo = new JTextField(20);
        add(campo);
        JButton boton = new JButton("Comprobar");
        boton.addActionListener(new DameTexto());
        add(boton);

    }

    private class DameTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(campo.getText().trim());
        }
    }
}
