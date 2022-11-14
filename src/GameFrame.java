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
    BufferedImage gameBack,blue,yellow,red,black,white,one;
    JButton nextButton, submitButton;
    JRadioButton selectionMenu;
    JScrollPane log;
    JTextArea logTxt;
    ImageIcon icon;
    public GameFrame() //constructor
    {
        this.setSize(1440, 1024);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Azul Board Game");

        try {
            //where all the BufferedImage variables will be instantiated
            gameBack = ImageIO.read(MainFrame.class.getResource("/images/gameBackground.png"));
            icon = new ImageIcon(ImageIO.read(GameFrame.class.getResource("/images/azulIconImage.PNG")));
        } catch (Exception E) {
            System.out.println("Error with instantiating the images in GameFrame");
            return;
        }

        this.addMouseListener(this);
        this.setIconImage(icon.getImage());

        game = new Game();

        this.setVisible(true);
    }

    /***************** PAINT *********************/
    ///game.getFactory(0).getTilesPresent().get(0).getImage()  (this is how to get each image)
    public void paint(Graphics g)
    {
        //whatever goes in here, shall go in here
        g.drawImage(gameBack,0,30,getWidth(),getHeight() - 30,null);
        //factory 0
        g.drawImage(black,535,42,49,49,null);
        g.drawImage(black,584,42,49,49,null);
        g.drawImage(black,535,91,49,49,null);
        g.drawImage(black,584,91,49,49,null);
        //factory 1
        g.drawImage(white,670,42,49,49,null);
        g.drawImage(white,719,42,49,49,null);
        g.drawImage(white,670,91,49,49,null);
        g.drawImage(white,719,91,49,49,null);
        //factory 2
        g.drawImage(red,807,42,49,49,null);
        g.drawImage(red,856,42,49,49,null);
        g.drawImage(red,807,91,49,49,null);
        g.drawImage(red,856,91,49,49,null);
        //factory 3
        g.drawImage(blue,463,164,49,49,null);
        g.drawImage(blue,512,164,49,49,null);
        g.drawImage(blue,463,213,49,49,null);
        g.drawImage(blue,512,213,49,49,null);
        //factory 4
        g.drawImage(yellow,670,164,49,49,null);
        g.drawImage(yellow,719,164,49,49,null);
        g.drawImage(yellow,670,213,49,49,null);
        g.drawImage(yellow,719,213,49,49,null);
        //factory 5
        g.drawImage(black,875,164,49,49,null);
        g.drawImage(black,924,164,49,49,null);
        g.drawImage(black,875,213,49,49,null);
        g.drawImage(black,924,213,49,49,null);
        //factory 6
        g.drawImage(white,535,283,49,49,null);
        g.drawImage(white,584,283,49,49,null);
        g.drawImage(white,535,332,49,49,null);
        g.drawImage(white,584,332,49,49,null);
        //factory 7
        g.drawImage(red,670,283,49,49,null);
        g.drawImage(red,719,283,49,49,null);
        g.drawImage(red,670,332,49,49,null);
        g.drawImage(red,719,332,49,49,null);
        //factory 8
        g.drawImage(blue,807,283,49,49,null);
        g.drawImage(blue,856,283,49,49,null);
        g.drawImage(blue,807,332,49,49,null);
        g.drawImage(blue,856,332,49,49,null);
        //
        ////scrollpane
        //

        //
        //////main board
        //
        g.setColor(Color.BLACK);
        int addCol=0;
        int addRow=0;
        g.fillRect(441+addCol,430+addRow,28,28);  // 31 pixels right per point and 33 down for next row
        //one tile
        g.drawImage(one,437,728,49,49,null);
        //
        //////////tile area
        // row 0
        //
        g.drawImage(black,750,621,49,49,null);
        g.drawImage(black,807,621,49,49,null);
        g.drawImage(black,864,621,49,49,null);
        g.drawImage(black,919,621,49,49,null);
        g.drawImage(black,976,621,49,49,null);
        //row 1
        g.drawImage(white,750,673,49,49,null);
        g.drawImage(white,806,673,49,49,null);
        g.drawImage(white,864,673,49,49,null);
        g.drawImage(white,919,673,49,49,null);
        g.drawImage(white,975,674,49,49,null);
        //row 2
        g.drawImage(red,749,730,49,49,null);
        g.drawImage(red,807,730,49,49,null);
        g.drawImage(red,864,730,49,49,null);
        g.drawImage(red,919,730,49,49,null);
        g.drawImage(red,975,730,49,49,null);
        //row 3
        g.drawImage(blue,749,787,49,49,null);
        g.drawImage(blue,805,787,49,49,null);
        g.drawImage(blue,863,787,49,49,null);
        g.drawImage(blue,919,787,49,49,null);
        g.drawImage(blue,975,787,49,49,null);
        //row 4
        g.drawImage(yellow,749,844,49,49,null);
        g.drawImage(yellow,805,844,49,49,null);
        g.drawImage(yellow,863,844,49,49,null);
        g.drawImage(yellow,919,844,49,49,null);
        g.drawImage(yellow,975,844,49,49,null);
        //
        ////////the wall
        //row 0
        //
        g.drawImage(black,665,621,49,49,null);
        //row 1
        g.drawImage(white,607,673,49,49,null);
        g.drawImage(white,665,673,49,49,null);
        //row 2
        g.drawImage(red,551,730,49,49,null);
        g.drawImage(red,607,730,49,49,null);
        g.drawImage(red,665,730,49,49,null);
        //row 3
        g.drawImage(blue,494,787,49,49,null);
        g.drawImage(blue,551,787,49,49,null);
        g.drawImage(blue,607,787,49,49,null);
        g.drawImage(blue,665,787,49,49,null);
        //row 4
        g.drawImage(yellow,439,844,49,49,null);
        g.drawImage(yellow,494,844,49,49,null);
        g.drawImage(yellow,551,844,49,49,null);
        g.drawImage(yellow,607,844,49,49,null);
        g.drawImage(yellow,665,844,49,49,null);
        //
        ////floor line
        //
        g.drawImage(black,437,940,49,49,null);
        g.drawImage(black,499,940,49,49,null);
        g.drawImage(black,561,940,49,49,null);
        g.drawImage(black,623,940,49,49,null);
        g.drawImage(black,684,940,49,49,null);
        g.drawImage(black,746,940,49,49,null);
        g.drawImage(black,808,940,49,49,null);
        //
        ////top board
        //
        g.setColor(Color.BLACK);
        int addCol1,addRow1;
        addCol1=0;
        addRow1=0;
        g.fillRect(1119+addCol1,47+addRow1,15,15);//add 15 for next column, add 17 for next row
        //one tile
        g.drawImage(one,1118,201,25,25,null);
        //row 0
        g.drawImage(black,1281,147,25,25,null);
        g.drawImage(black,1311,147,25,25,null);
        g.drawImage(black,1341,147,25,25,null);
        g.drawImage(black,1371,147,25,25,null);
        g.drawImage(black,1401,147,25,25,null);
        //row 1
        g.drawImage(white,1281,178,25,25,null);
        g.drawImage(white,1311,178,25,25,null);
        g.drawImage(white,1341,178,25,25,null);
        g.drawImage(white,1371,178,25,25,null);
        g.drawImage(white,1401,178,25,25,null);
        //row 2
        g.drawImage(red,1281,206,25,25,null);
        g.drawImage(red,1311,206,25,25,null);
        g.drawImage(red,1341,206,25,25,null);
        g.drawImage(red,1371,206,25,25,null);
        g.drawImage(red,1401,206,25,25,null);
        //row 3
        g.drawImage(blue,1281,236,25,25,null);
        g.drawImage(blue,1311,236,25,25,null);
        g.drawImage(blue,1341,236,25,25,null);
        g.drawImage(blue,1371,236,25,25,null);
        g.drawImage(blue,1401,236,25,25,null);
        //row 4
        g.drawImage(yellow,1281,265,25,25,null);
        g.drawImage(yellow,1311,265,25,25,null);
        g.drawImage(yellow,1341,265,25,25,null);
        g.drawImage(yellow,1371,265,25,25,null);
        g.drawImage(yellow,1401,265,25,25,null);
        //
        //the wall
        //
        //row 0
        g.drawImage(black,1235,147,25,25,null);
        //row 1
        g.drawImage(white,1205,178,25,25,null);
        g.drawImage(white,1235,178,25,25,null);
        //row 2
        g.drawImage(red,1176,206,25,25,null);
        g.drawImage(red,1205,206,25,25,null);
        g.drawImage(red,1235,206,25,25,null);
        //row 3
        g.drawImage(blue,1145,236,25,25,null);
        g.drawImage(blue,1176,236,25,25,null);
        g.drawImage(blue,1205,236,25,25,null);
        g.drawImage(blue,1235,236,25,25,null);
        //row 4
        g.drawImage(yellow,1116,265,25,25,null);
        g.drawImage(yellow,1145,265,25,25,null);
        g.drawImage(yellow,1176,265,25,25,null);
        g.drawImage(yellow,1205,265,25,25,null);
        g.drawImage(yellow,1235,265,25,25,null);
        //
        ////floor line
        //
        g.drawImage(black,1116,318,25,25,null);
        g.drawImage(black,1149,318,25,25,null);
        g.drawImage(black,1182,318,25,25,null);
        g.drawImage(black,1214,318,25,25,null);
        g.drawImage(black,1247,318,25,25,null);
        g.drawImage(black,1279,318,25,25,null);
        g.drawImage(black,1312,318,25,25,null);
        //
        ////middle board
        //
        g.setColor(Color.BLACK);
        int addCol2,addRow2;
        addCol2=0;
        addRow2=0;
        g.fillRect(1119+addCol2,379+addRow2,15,15);//add 15 for next column, add 17 for next row
        //one tile
        g.drawImage(one,1118,533,25,25,null);
        //row 0
        g.drawImage(black,1281,479,25,25,null);
        g.drawImage(black,1311,479,25,25,null);
        g.drawImage(black,1341,479,25,25,null);
        g.drawImage(black,1371,479,25,25,null);
        g.drawImage(black,1401,479,25,25,null);
        //row 1
        g.drawImage(white,1281,510,25,25,null);
        g.drawImage(white,1311,510,25,25,null);
        g.drawImage(white,1341,510,25,25,null);
        g.drawImage(white,1371,510,25,25,null);
        g.drawImage(white,1401,510,25,25,null);
        //row 2
        g.drawImage(red,1281,538,25,25,null);
        g.drawImage(red,1311,538,25,25,null);
        g.drawImage(red,1341,538,25,25,null);
        g.drawImage(red,1371,538,25,25,null);
        g.drawImage(red,1401,538,25,25,null);
        //row 3
        g.drawImage(blue,1281,568,25,25,null);
        g.drawImage(blue,1311,568,25,25,null);
        g.drawImage(blue,1341,568,25,25,null);
        g.drawImage(blue,1371,568,25,25,null);
        g.drawImage(blue,1401,568,25,25,null);
        //row 4
        g.drawImage(yellow,1281,597,25,25,null);
        g.drawImage(yellow,1311,597,25,25,null);
        g.drawImage(yellow,1341,597,25,25,null);
        g.drawImage(yellow,1371,597,25,25,null);
        g.drawImage(yellow,1401,597,25,25,null);
        //
        //the wall
        //
        //row 0
        g.drawImage(black,1235,479,25,25,null);
        //row 1
        g.drawImage(white,1205,510,25,25,null);
        g.drawImage(white,1235,510,25,25,null);
        //row 2
        g.drawImage(red,1176,538,25,25,null);
        g.drawImage(red,1205,538,25,25,null);
        g.drawImage(red,1235,538,25,25,null);
        //row 3
        g.drawImage(blue,1145,568,25,25,null);
        g.drawImage(blue,1176,568,25,25,null);
        g.drawImage(blue,1205,568,25,25,null);
        g.drawImage(blue,1235,568,25,25,null);
        //row 4
        g.drawImage(yellow,1116,597,25,25,null);
        g.drawImage(yellow,1145,597,25,25,null);
        g.drawImage(yellow,1176,597,25,25,null);
        g.drawImage(yellow,1205,597,25,25,null);
        g.drawImage(yellow,1235,597,25,25,null);
        //
        ////floor line
        //
        g.drawImage(black,1116,650,25,25,null);
        g.drawImage(black,1149,650,25,25,null);
        g.drawImage(black,1182,650,25,25,null);
        g.drawImage(black,1214,650,25,25,null);
        g.drawImage(black,1247,650,25,25,null);
        g.drawImage(black,1279,650,25,25,null);
        g.drawImage(black,1312,650,25,25,null);
        //
        ////bottom board
        //
        g.setColor(Color.BLACK);
        int addCol3,addRow3;
        addCol3=0;
        addRow3=0;
        g.fillRect(1119+addCol2,711+addRow3,15,15);//add 15 for next column, add 17 for next row
        //one tile
        g.drawImage(one,1118,863,25,25,null);
        //row 0
        g.drawImage(black,1281,811,25,25,null);
        g.drawImage(black,1311,811,25,25,null);
        g.drawImage(black,1341,811,25,25,null);
        g.drawImage(black,1371,811,25,25,null);
        g.drawImage(black,1401,811,25,25,null);
        //row 1
        g.drawImage(white,1281,842,25,25,null);
        g.drawImage(white,1311,842,25,25,null);
        g.drawImage(white,1341,842,25,25,null);
        g.drawImage(white,1371,842,25,25,null);
        g.drawImage(white,1401,842,25,25,null);
        //row 2
        g.drawImage(red,1281,870,25,25,null);
        g.drawImage(red,1311,870,25,25,null);
        g.drawImage(red,1341,870,25,25,null);
        g.drawImage(red,1371,870,25,25,null);
        g.drawImage(red,1401,870,25,25,null);
        //row 3
        g.drawImage(blue,1281,900,25,25,null);
        g.drawImage(blue,1311,900,25,25,null);
        g.drawImage(blue,1341,900,25,25,null);
        g.drawImage(blue,1371,900,25,25,null);
        g.drawImage(blue,1401,900,25,25,null);
        //row 4
        g.drawImage(yellow,1281,929,25,25,null);
        g.drawImage(yellow,1311,929,25,25,null);
        g.drawImage(yellow,1341,929,25,25,null);
        g.drawImage(yellow,1371,929,25,25,null);
        g.drawImage(yellow,1401,929,25,25,null);
        //
        //the wall
        //
        //row 0
        g.drawImage(black,1235,811,25,25,null);
        //row 1
        g.drawImage(white,1205,842,25,25,null);
        g.drawImage(white,1235,842,25,25,null);
        //row 2
        g.drawImage(red,1176,870,25,25,null);
        g.drawImage(red,1205,870,25,25,null);
        g.drawImage(red,1235,870,25,25,null);
        //row 3
        g.drawImage(blue,1145,900,25,25,null);
        g.drawImage(blue,1176,900,25,25,null);
        g.drawImage(blue,1205,900,25,25,null);
        g.drawImage(blue,1235,900,25,25,null);
        //row 4
        g.drawImage(yellow,1116,929,25,25,null);
        g.drawImage(yellow,1145,929,25,25,null);
        g.drawImage(yellow,1176,929,25,25,null);
        g.drawImage(yellow,1205,929,25,25,null);
        g.drawImage(yellow,1235,929,25,25,null);
        //
        ////floor line
        //
        g.drawImage(black,1116,982,25,25,null);
        g.drawImage(black,1149,982,25,25,null);
        g.drawImage(black,1182,982,25,25,null);
        g.drawImage(black,1214,982,25,25,null);
        g.drawImage(black,1247,982,25,25,null);
        g.drawImage(black,1279,982,25,25,null);
        g.drawImage(black,1312,982,25,25,null);
        //
        //floor text
        //
        g.setFont(new Font("Comic Sans",Font.BOLD,43));
        g.drawString("- 0",90,103);
        g.drawString("- 0",90,161);
        g.drawString("- 0",90,219);
        g.drawString("- 0",90,277);
        g.drawString("- 0",90,335);
        //
        //trash text
        //
        g.drawString("- 0",90,435);
        g.drawString("- 0",90,493);
        g.drawString("- 0",90,551);
        g.drawString("- 0",90,609);
        g.drawString("- 0",90,667);
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
