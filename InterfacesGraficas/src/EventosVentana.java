import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventosVentana extends JFrame {
    public EventosVentana(){
        //setTitle("Respondiendo");
        //setBounds(300,300,500,350);
        setVisible(true);

        addWindowListener(new MVentana());
    }

    public class MVentana extends WindowAdapter {

        @Override
        public void windowIconified(WindowEvent e) {
            System.out.println("Ventana minimizada");
        }

    }
}
