import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class BonusFrame extends JFrame implements MouseListener
{

    Game game;

    BufferedImage icon, background, next;

    public BonusFrame(Game g)
    {
        this.setSize(1440, 1024);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Azul Board Game");

        try
        {
            icon = ImageIO.read(BonusFrame.class.getResource("/images/azulIconImage.PNG"));
            background = ImageIO.read(BonusFrame.class.getResource("/images/bonusBackground.png"));
            next = ImageIO.read(BonusFrame.class.getResource("/images/next.png"));
        }
        catch(Exception E)
        {
            System.out.println("Error with instantiating images in BonusFrame class");
        }

        this.addMouseListener(this);
        this.setIconImage(icon);

        this.setVisible(true);


    }

    public void paint(Graphics g)
    {
        g.drawImage(background, 0, 30, 1440, 994, null);


    }


    @Override
    public void mouseClicked(MouseEvent e)
    {

    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
