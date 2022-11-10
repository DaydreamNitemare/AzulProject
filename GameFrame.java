import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameFrame extends JFrame implements ActionListener, MouseListener
{

    Game game;

    public GameFrame()
    {
        game = new Game();
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
