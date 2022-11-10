import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class GameFrame extends JFrame implements ActionListener, MouseListener
{

    Game game;
    BufferedImage gameBack;
    JButton nextButton, submitButton;
    JRadioButton selectionMenu;
    public GameFrame() //constructor
    {
        this.setSize(1440, 1024);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        try {
            //where all the BufferedImage variables will be instantiated
            gameBack = ImageIO.read(MainFrame.class.getResource("/images/gameBackground.png"));
        } catch (Exception E) {
            System.out.println("Error with instantiating the images in GameFrame");
            return;
        }

        this.addMouseListener(this);
        this.setVisible(true);
    }

    /***************** PAINT *********************/

    public void paint(Graphics g)
    {
        //whatever goes in here, shall go in here
        g.drawImage(gameBack,0,30,getWidth(),getHeight() - 30,null);
    }

    /************************* ACTION PERFORMED ********************/

    public void actionPerformed(ActionEvent e) //really only necessary for the next player and submit buttons
    {
        //dont forget to add ActionListeners for the JButtons and JRadioButtons
    }


    /********************* MOUSE CLICKED ************************/

    public void mouseClicked(MouseEvent e) //will be short because most code will be in the Click class
    {
        int x = e.getX();
        int y = e.getY();

        System.out.println("loc of click is (" + x + " , " + y + ")");

        /*
        if(game.getCurrentPlayer().playerCanDraw())
        {
            Click c = new Click(x, y, game.getCurrentPlayer());
            while(!c.draw())
                return;
            game.getCurrentPlayer().changeCanDraw(false);
            game.getCurrentPlayer().canPlay(true);

            //below here, write the code that will display the JRadioButtons to have the player choose the rows.

            //then, include a check to see if there are no more tiles to then end the round/game
          }
        */
    }

    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e) {}
}
