import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContenedorCalculadora extends JPanel {

    private JPanel lamina2;
    private JLabel pantalla;
    private boolean principioBandera;
    private double resultado;
    private String ultimaOperacion;

    public ContenedorCalculadora(){
        principioBandera = true;
        ultimaOperacion = "=";

        setLayout(new BorderLayout());
        pantalla = new JLabel("0",SwingConstants.CENTER);
        //pantalla.setEnabled(false);
        add(pantalla,BorderLayout.NORTH);
        lamina2 = new JPanel();
        lamina2.setLayout(new GridLayout(4,4));

        InsertarNumero insertar = new InsertarNumero();
        AccionOrden accion = new AccionOrden();

        botonesCal("7",insertar);
        botonesCal("8",insertar);
        botonesCal("9",insertar);
        botonesCal("/",accion);

        botonesCal("4",insertar);
        botonesCal("5",insertar);
        botonesCal("6",insertar);
        botonesCal("*",accion);

        botonesCal("1",insertar);
        botonesCal("2",insertar);
        botonesCal("3",insertar);
        botonesCal("-",accion);

        botonesCal("0",insertar);
        botonesCal(".",insertar);
        botonesCal("=",accion);
        botonesCal("+",accion);

        add(lamina2, BorderLayout.CENTER);

    }

    private void botonesCal(String numero, ActionListener oyente){
        JButton boton = new JButton(numero);
        boton.addActionListener(oyente);
        lamina2.add(boton);

    }

    private class InsertarNumero implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String entrada = e.getActionCommand();
            if (principioBandera) {
                pantalla.setText("");
                principioBandera = false;

            }

            pantalla.setText(pantalla.getText() + entrada);

        }
    }

    private class AccionOrden implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String operacion = e.getActionCommand();
            calcular(Double.parseDouble(pantalla.getText()));
            ultimaOperacion = operacion;
            principioBandera = true;
        }

        public void calcular(double x){

            if(ultimaOperacion.equals("+")){
                resultado+= x;
            }else if(ultimaOperacion.equals("-")){
                resultado-=x;
            }else if(ultimaOperacion.equals("*")){
                resultado*=x;
            }else if(ultimaOperacion.equals("/")){
                resultado/=x;
            }else if(ultimaOperacion.equals("=")){
                resultado=x;
            }

            pantalla.setText("" + resultado);
        }
    }
}
