import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class MarcoConTexto extends JFrame{

    public MarcoConTexto(){
        setVisible(true);
        setSize(500,400);
        setLocation(400,300);
        setTitle("Elemento Panel");

        Panel panel = new Panel();
        add(panel);

    }
}

class Panel extends JPanel{

    private Image imagen;

    public Panel(){
        try{
            imagen = ImageIO.read(new File("src/icon.png"));
        }catch (IOException e){
            System.out.println("Imagen no encontrada");
        }

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        /*Font fuente = new Font("Arial", Font.BOLD, 26);
        g2.setFont(fuente);
        g2.setColor(new Color(128, 60, 122));
        g2.drawString("Aprendiendo Swing",100,300);

        try{
            imagen = ImageIO.read(new File("src/pokemon.png"));
        }catch (IOException e){
            System.out.println("Imagen no encontrada");
        }

        g2.drawImage(imagen, 100,5,null);*/

        int anchoImg = imagen.getWidth(this);
        int altoImg = imagen.getHeight(this);

        g2.drawImage(imagen, 0,0,null );

        for (int i = 0; i < 500 ; i++) {
            for (int j = 0; j < 400; j++) {
                if(i+j>0){
                    g.copyArea(0,0,anchoImg,altoImg,anchoImg*i,altoImg*j);
                }
            }
        }

    }

}
