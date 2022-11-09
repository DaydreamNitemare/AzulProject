import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;

import static java.lang.System.out;

//blue 0
//white 1
//black 2
//red 3
//yellow 4
public class MainFrame extends JFrame implements ActionListener {
    final static int WIDTH=1440;
    final static int HEIGHT=1024;
    private BufferedImage title,temp1,startback;
    private JButton start,howTo,cred;
    private ImageIcon icon;
    public MainFrame(String str) {
        //super(str);
        setSize (WIDTH, HEIGHT);
        setResizable(false);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        try {
            title=ImageIO.read(MainFrame.class.getResource("/images/title.png"));
            startback= ImageIO.read(MainFrame.class.getResource("/images/startbackground.png"));
            icon =new ImageIcon(MainFrame.class.getResource("/images/invisible.png"));

        }
        catch (Exception E) {
            out.println("Exception error");
            return;
        } start = new JButton();
        howTo=new JButton();
        add(start);


        add(howTo);
        drawStart();

        repaint();

    }


    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==start) {
            //out.println("start");
            start.setVisible(true);
            out.println("Start Game");
        }
        repaint();
        start.setFocusable(false);
        start.addActionListener(this);
        start.setVisible(true);
        start.setEnabled(true);
        start.setBounds(540,353,200,100);
        //start.setBorder(new RoundedBorder(30));
        //start.setBorderPainted(false);
       // start.setContentAreaFilled(false);
        //start.setOpaque(false);
        //start.setOpaque(false);
       // start.setContentAreaFilled(false);
       // start.setBorderPainted(false);
        howTo.setText("How To");
        howTo.setFocusable(false);
        howTo.addActionListener(this);
        howTo.setVisible(false);
        howTo.setBounds(100,100,100,100);
        howTo.setSize(100   ,100);
    }

    public void paint(Graphics g) {

       // g.setColor(new Color(232,254,254));
        //g.fillRect(0,0,1280,720);
       // g.drawImage(title,439,80,403,286,null);//for some reason it only showTos up after I click;
        g.drawImage(startback,0,0,getWidth(),getHeight(),null);
    }
    public void drawStart(){


        //start.setText("Start");


    }

}
