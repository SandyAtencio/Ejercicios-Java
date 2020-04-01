import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaTexto {

    public static void main(String[] args) {
        Marco ventana = new Marco();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }


}

class Marco extends JFrame{
    public Marco(){
        setTitle("Componentes de Textos");
        setBounds(500,100,650,300);
        Contenedor contenedor = new Contenedor();
        add(contenedor);
    }
}

