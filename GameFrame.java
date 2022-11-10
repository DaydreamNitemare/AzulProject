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
    BufferedImage gameback;
    public GameFrame()
    {
     //   game = new Game();

        try
        {
            //where all of the BufferedImage variables will be instantiated
         gameback= ImageIO.read(MainFrame.class.getResource("/images/gamebackground.png"));
            }
        catch (Exception E) {
            System.out.println("Error with instantiating the images in MainFrame");
            return;
        }









    }
    public void paint(Graphics g)
    {
        //whatever goes in here, shall go in here
        g.drawImage(gameback,0,0,getWidth(),getHeight(),null);
    }



    /************************* ACTION PERFORMED ********************/

    public void actionPerformed(ActionEvent e)
    {

    }


    /********************* MOUSE CLICKED ************************/

    public void mouseClicked(MouseEvent e)
    {
        if(game.getCurrentPlayer().canDraw())
        {
            Click c = new Click(e.getX(), e.getY(), game.getCurrentPlayer());
            c.draw();
        }

    }

    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e) {}
}
