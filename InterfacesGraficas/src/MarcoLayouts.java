import javax.swing.*;
import java.awt.*;

public class MarcoLayouts extends JFrame{
    public MarcoLayouts(){
        setTitle("Prueba acciones");
        setBounds(60,350,600,300);
        PanelLayout lamina1 = new PanelLayout();
        PanelLayout2 lamina2 = new PanelLayout2();
        //lamina.setLayout(new FlowLayout(FlowLayout.LEFT));
        add(lamina1,BorderLayout.NORTH);
        add(lamina2,BorderLayout.SOUTH);
        setVisible(true);
    }
}
class PanelLayout extends JPanel{
    public PanelLayout(){
        setLayout(new FlowLayout());
        add(new JButton("Amarillo"));
        add(new JButton("Azul"));

    }
}
class PanelLayout2 extends JPanel{
    public PanelLayout2(){
        setLayout(new BorderLayout());
        add(new JButton("Azul"),BorderLayout.WEST);
        add(new JButton("Negro"), BorderLayout.CENTER);
        add(new JButton("Verde"), BorderLayout.EAST);
    }
}
