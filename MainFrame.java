import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class MainFrame extends JFrame implements ActionListener, MouseListener {
    final int WIDTH=1440; //width
    final int HEIGHT=1024; //height

    //add the BufferedImages here. Make sure to add them onto the GitHub pls
    BufferedImage title,startback;
    ImageIcon icon;
    JButton start; //start button. Feel free to add more buttons here but one at a time to not get confused.
    public MainFrame() //constructor
    {
        this.setSize (WIDTH, HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        try
        {
            //where all of the BufferedImage variables will be instantiated

            startback= ImageIO.read(MainFrame.class.getResource("/images/startbackground.png"));
            //icon=newImageIcon


        }
        catch (Exception E) {
            System.out.println("Error with instantiating the images in MainFrame");
            return;
        }

        /************************ START BUTTON ************************/

        start = new JButton(); //instantiates the button
        //these next few lines make the button active but invisible. feel free to add an image or set opaque true to debug
        start.setOpaque(false);
        start.setFocusable(false);
        start.setContentAreaFilled(false);
        start.setBorderPainted(false);
        //it's these 4 above
        start.addActionListener(this); //adds an action listener
        start.setBounds(0,0,200,100); //dimensions
        //start.setIcon(); //the image present on the button
        start.setVisible(false);
        this.add(start); //adds the start button to the frame
        this.setVisible(true);
        addMouseListener(this);

    }

    /********************* ACTION PERFORMED METHOD *******************/

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == start)
        { //this will close the MainFrame and open a GameFrame when the start button is clicked
            this.dispose();
            //new GameFrame();
        }

    }

    /*************************** PAINT METHOD **************************/

    public void paint(Graphics g)
    {
        //whatever goes in here, shall go in here
        g.drawImage(startback,0,0,getWidth(),getHeight(),null);
    }


    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("oc is (" + x + "," + y + ")");

        //start button mouselistener
        if(x>550&&x<890&&y>690&&y<790){
            System.out.println("Start Game");
            this.dispose();
            //new GameFrame();
        }
        //How to Play button mouselistener
        if(x>460&&x<700&&y>810&&y<870){
            System.out.println("How To Play");
        }
        //Credits button mouselistener
        if(x>740&&x<970&&y>810&&y<870){
            System.out.println("Credits");
        }
    }
}
