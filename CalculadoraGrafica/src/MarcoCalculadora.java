import javax.swing.*;

class MarcoCalculadora extends JFrame {

    public MarcoCalculadora(){
        setTitle("Calculadora");
        setBounds(500,300,250,300);
        ContenedorCalculadora lamina1 = new ContenedorCalculadora();
        add(lamina1);

    }
}
