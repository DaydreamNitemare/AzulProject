import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class EndFrame extends JFrame implements MouseListener
{

    BufferedImage icon, background, next;
    Game game;

    public EndFrame(Game g)
    {
        this.setSize(1440, 1024);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Azul Board Game");

        try
        {
            icon = ImageIO.read(EndFrame.class.getResource("/images/azulIconImage.PNG"));
            background = ImageIO.read(EndFrame.class.getResource("/images/justBackground.png"));
            next = ImageIO.read(EndFrame.class.getResource("/images/next.png"));
        }
        catch(Exception E)
        {
            System.out.println("Error with instantiating images in EndFrame class");
        }

        this.addMouseListener(this);
        this.setIconImage(icon);

        game = g;

        this.setVisible(true);

    }

    public void paint(Graphics g)
    {
        Player[]balls=game.getPlayers();
        g.drawImage(background, 0, 30, 1440, 994, null); //draws the background

        g.drawImage(next, 670, 797, 100, 50, null); //draws next button

        g.setFont(new Font("Comic Sans", Font.BOLD, 36));
        g.drawString(game.getWinner(), 200, 200);

        g.setFont(new Font("Comic Sans", Font.BOLD, 30));
        g.drawString("Player 1 has "+game.getPlayers()[0].getPoints()+" points and "+game.getPlayers()[0].getWall().numRowsCompleted()+ " rows completed.",200,400 );
        g.drawString("Player 2 has "+game.getPlayers()[1].getPoints()+" points and "+game.getPlayers()[1].getWall().numRowsCompleted()+ " rows completed.",200,440 );
        g.drawString("Player 3 has "+game.getPlayers()[2].getPoints()+" points and "+game.getPlayers()[2].getWall().numRowsCompleted()+ " rows completed.",200,480 );
        g.drawString("Player 4 has "+game.getPlayers()[3].getPoints()+" points and "+game.getPlayers()[3].getWall().numRowsCompleted()+ " rows completed.",200,520 );
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();

        System.out.println("loc of click is (" + x + " , " + y + ")");

        if(x >= 670 && x <= 770 && y >= 797 && y <= 847)
        {
            this.dispose();
            new MainFrame();
        }
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}

