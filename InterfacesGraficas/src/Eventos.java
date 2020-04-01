import javax.swing.*;

public class Eventos extends JFrame{

    public Eventos(){
        setVisible(true);
        setBounds(400,100,500,400);
        setTitle("Eventos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PruebaEventos contenedor = new PruebaEventos();
        add(contenedor);
    }

}
