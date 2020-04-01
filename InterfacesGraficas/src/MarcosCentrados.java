import javax.swing.*;
import java.awt.*;

public class MarcosCentrados extends JFrame {

    public MarcosCentrados(){
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int w = tamanoPantalla.width;
        int h = tamanoPantalla.height;
        setSize(w/2,h/2);
        setLocation(w/4,h/4);
        setVisible(true);
        setTitle("Ventana Personalizada");
        Image icono = miPantalla.getImage("src/icon.png");
        setIconImage(icono);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
