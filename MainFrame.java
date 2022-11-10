import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;

//blue 0
//yellow 1
//red 2
//black 3
//white 4

public class MainFrame extends JFrame implements ActionListener {
    final int WIDTH=1440; //width
    final int HEIGHT=1024; //height

    //add the BufferedImages here. Make sure to add them onto the GitHub pls
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

        this.add(start); //adds the start button to the frame
        this.setVisible(true);


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
    }

}
