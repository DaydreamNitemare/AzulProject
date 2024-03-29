import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;

//blue 0
//yellow 1
//red 2
//black 3
//white 4

public class MainFrame extends JFrame implements MouseListener {
    final int WIDTH=1440; //width
    final int HEIGHT=1024; //height

    //add the BufferedImages here. Make sure to add them onto the GitHub pls
    BufferedImage title,startback;
    BufferedImage icon;
    JButton start; //start button. Feel free to add more buttons here but one at a time to not get confused.
    public MainFrame() //constructor
    {
        this.setSize (WIDTH, HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Azul Board Game");

        try
        {
            //where all of the BufferedImage variables will be instantiated

            startback= ImageIO.read(MainFrame.class.getResource("/images/startbackground.png"));
            icon = ImageIO.read(MainFrame.class.getResource("/images/azulIconImage.PNG"));

        }
        catch (Exception E) {
            System.out.println("Error with instantiating the images in MainFrame");
            return;
        }
        this.setIconImage(icon);

        this.setVisible(true);
        addMouseListener(this);

    }

    /*************************** PAINT METHOD **************************/

    public void paint(Graphics g)
    {
        //whatever goes in here, shall go in here

        g.drawImage(startback,0, 0, this.getWidth(), this.getHeight(),null);
    }

    /***************** MOUSE LISTENER ******************/

    public void mouseClicked(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();
        System.out.println("loc is (" + x + "," + y + ")");

        //start button mouselistener
        if(x> 545 && x <895 && y > 690 && y <795){
            System.out.println("Start Game");
            this.dispose();
            new GameFrame();
        }
        //How to Play button mouselistener
        if(x>460&&x<700&&y>810&&y<870){
            System.out.println("How To Play");
            this.dispose();
            new MenuFrame(0);
        }
        //Credits button mouselistener
        if(x>740&&x<970&&y>810&&y<870){
            System.out.println("Credits");
            this.dispose();
            new MenuFrame(1);
        }
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
