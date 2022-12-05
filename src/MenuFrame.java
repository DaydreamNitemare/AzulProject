import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class MenuFrame extends JFrame implements MouseListener {

    Game game;

    BufferedImage icon, background, next;
    BufferedImage blue, yellow, red, black, white;
    private int choose;
    public MenuFrame(int n) {
        this.setSize(1440, 1024);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Azul Board Game");
        this.addMouseListener(this);
        try {
            icon = ImageIO.read(BonusFrame.class.getResource("/images/azulIconImage.PNG"));
            background = ImageIO.read(BonusFrame.class.getResource("/images/justBackground.png"));
        }
        catch(Exception E)
        {
            System.out.println("Error with instantiating images in MenuFrame class");
        }
        this.setVisible(true);
        choose=n;
        this.setIconImage(icon);
    }
    public void paint(Graphics g) {
        g.drawImage(background, 0, 0, getWidth(), getHeight(), null);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Comic Sans",Font.PLAIN,25));
        if(choose==0){
            g.drawString("Instructions for how the actual game is played are available online.",30,80);
            g.drawString("These instructions are meant for operating our digital version of the game.",30,130);
            g.drawString("Starting player is expected to choose a tile from factory upon starting game.",30,180);
            g.drawString("Clicking one of the squares next to the board allows one to choose a row.",30,230);
            g.drawString("Submit button confirms your row of choice, and Next moves to next player.",30,280);
            g.drawString("Scoring works by clicking next for every row, regardless of there being tiles or not.",30,330);
            g.drawString("The 1 tile moves automatically and requires no input from the player.",30,380);
            g.drawString("Thank you for choosing our game and enjoy!",30,430);
            g.drawString("Click anywhere to return to menu",30,480);
        }
        if(choose==1){
            g.drawString("Ashmeet Chhabra, Christopher Cheng, Alvaro Camacho, Lucca Traslosheros Abascal, 12.2022",30,80);
            g.drawString("Click anywhere to return to menu",30,130);
        }
        else
            g.drawString("",10,10);

    }

        public void mouseClicked (MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();

        System.out.println("loc of click is (" + x + " , " + y + ")");

        if(x>0&&y>0)
        {

            this.dispose();
            new MainFrame(); //not done yet will do in a minute
        }
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}