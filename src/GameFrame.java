import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.TreeMap;

public class GameFrame extends JFrame implements ActionListener, MouseListener
{

    Game game;
    BufferedImage gameBack, submitButton, nextButton, blue, red, white, black, yellow, one, p1, p2, p3, p4;
    JPanel logPanel;
    JScrollPane log;
    JTextArea logTxt;
    ImageIcon icon;
    boolean r1, r2, r3, r4, r5, r6;
    public GameFrame() //constructor
    {
        this.setSize(1440, 1024);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Azul Board Game");

        try {
            //where all the BufferedImage variables will be instantiated
            gameBack = ImageIO.read(GameFrame.class.getResource("/images/gameBackground.png"));
            icon = new ImageIcon(ImageIO.read(GameFrame.class.getResource("/images/azulIconImage.PNG")));
            submitButton = ImageIO.read(GameFrame.class.getResource("/images/submit.png"));
            nextButton = ImageIO.read(GameFrame.class.getResource("/images/next.png"));
            p1 = ImageIO.read(GameFrame.class.getResource("/images/p1azul.jpg"));
            p2 = ImageIO.read(GameFrame.class.getResource("/images/p2azul.jpg"));
            p3 = ImageIO.read(GameFrame.class.getResource("/images/p3azul.jpg"));
            p4 = ImageIO.read(GameFrame.class.getResource("/images/p4azul.jpg"));
        } catch (Exception E) {
            System.out.println("Error with instantiating the images in GameFrame");
            return;
        }

        this.addMouseListener(this);
        this.setIconImage(icon.getImage());

        game = new Game();
        game.deal();
        game.getCurrentPlayer().setCanDraw(true);

        r1 = false; r2 = false; r3 = false; r4 = false; r5 = false; r6 = false;

        logPanel = new JPanel();
        this.add(logPanel);

        drawLog(game.getCurrentPlayer().getName() + " begins the round\n\n");

        this.setVisible(true);
    }

    /***************** PAINT *********************/
    ///game.getFactory(0).getTilesPresent().get(0).getImage()  (this is how to get each image)
    public void paint(Graphics g)
    {

        //background for the whole game
        g.drawImage(gameBack,0,30,getWidth(),getHeight() - 30,null);

        /********************* FACTORIES ***********************/

        //factory 0
        if(!game.getFactories()[0].isEmpty()) {
            g.drawImage(game.getFactories()[0].getTile(0).getImage(), 535, 42, 49, 49, null);
            g.drawImage(game.getFactories()[0].getTile(1).getImage(), 584, 42, 49, 49, null);
            g.drawImage(game.getFactories()[0].getTile(2).getImage(), 535, 91, 49, 49, null);
            g.drawImage(game.getFactories()[0].getTile(3).getImage(), 584, 91, 49, 49, null);
        }
        //factory 1
        if(!game.getFactories()[1].isEmpty()) {
            g.drawImage(game.getFactories()[1].getTile(0).getImage(), 670, 42, 49, 49, null);
            g.drawImage(game.getFactories()[1].getTile(1).getImage(), 719, 42, 49, 49, null);
            g.drawImage(game.getFactories()[1].getTile(2).getImage(), 670, 91, 49, 49, null);
            g.drawImage(game.getFactories()[1].getTile(3).getImage(), 719, 91, 49, 49, null);
        }
        //factory 2
        if(!game.getFactories()[2].isEmpty()) {
            g.drawImage(game.getFactories()[2].getTile(0).getImage(), 807, 42, 49, 49, null);
            g.drawImage(game.getFactories()[2].getTile(1).getImage(), 856, 42, 49, 49, null);
            g.drawImage(game.getFactories()[2].getTile(2).getImage(), 807, 91, 49, 49, null);
            g.drawImage(game.getFactories()[2].getTile(3).getImage(), 856, 91, 49, 49, null);
        }
        //factory 3
        if(!game.getFactories()[3].isEmpty()) {
            g.drawImage(game.getFactories()[3].getTile(0).getImage(), 463, 164, 49, 49, null);
            g.drawImage(game.getFactories()[3].getTile(1).getImage(), 512, 164, 49, 49, null);
            g.drawImage(game.getFactories()[3].getTile(2).getImage(), 463, 213, 49, 49, null);
            g.drawImage(game.getFactories()[3].getTile(3).getImage(), 512, 213, 49, 49, null);
        }
        //factory 4
        if(!game.getFactories()[4].isEmpty()) {
            g.drawImage(game.getFactories()[4].getTile(0).getImage(), 670, 164, 49, 49, null);
            g.drawImage(game.getFactories()[4].getTile(1).getImage(), 719, 164, 49, 49, null);
            g.drawImage(game.getFactories()[4].getTile(2).getImage(), 670, 213, 49, 49, null);
            g.drawImage(game.getFactories()[4].getTile(3).getImage(), 719, 213, 49, 49, null);
        }
        //factory 5
        if(!game.getFactories()[5].isEmpty()) {
            g.drawImage(game.getFactories()[5].getTile(0).getImage(), 875, 164, 49, 49, null);
            g.drawImage(game.getFactories()[5].getTile(1).getImage(), 924, 164, 49, 49, null);
            g.drawImage(game.getFactories()[5].getTile(2).getImage(), 875, 213, 49, 49, null);
            g.drawImage(game.getFactories()[5].getTile(3).getImage(), 924, 213, 49, 49, null);
        }
        //factory 6
        if(!game.getFactories()[6].isEmpty()) {
            g.drawImage(game.getFactories()[6].getTile(0).getImage(), 535, 283, 49, 49, null);
            g.drawImage(game.getFactories()[6].getTile(1).getImage(), 584, 283, 49, 49, null);
            g.drawImage(game.getFactories()[6].getTile(2).getImage(), 535, 332, 49, 49, null);
            g.drawImage(game.getFactories()[6].getTile(3).getImage(), 584, 332, 49, 49, null);
        }
        //factory 7
        if(!game.getFactories()[7].isEmpty()) {
            g.drawImage(game.getFactories()[7].getTile(0).getImage(), 670, 283, 49, 49, null);
            g.drawImage(game.getFactories()[7].getTile(1).getImage(), 719, 283, 49, 49, null);
            g.drawImage(game.getFactories()[7].getTile(2).getImage(), 670, 332, 49, 49, null);
            g.drawImage(game.getFactories()[7].getTile(3).getImage(), 719, 332, 49, 49, null);
        }
        //factory 8
        if(!game.getFactories()[8].isEmpty()) {
            g.drawImage(game.getFactories()[8].getTile(0).getImage(), 807, 283, 49, 49, null);
            g.drawImage(game.getFactories()[8].getTile(1).getImage(), 856, 283, 49, 49, null);
            g.drawImage(game.getFactories()[8].getTile(2).getImage(), 807, 332, 49, 49, null);
            g.drawImage(game.getFactories()[8].getTile(3).getImage(), 856, 332, 49, 49, null);
        }
        //


        /********************* ACTUAL BOARD **************************/

        g.setColor(Color.BLACK);
        int addCol=0;
        int addRow=0;
        addCol=(game.getCurrentPlayer().getPoints()*31)%21;
        addRow=game.getCurrentPlayer().getPoints();
        if(game.getCurrentPlayer().getPoints()==0){
            g.fillRect(440,397,28,28);
        }
        else g.fillRect(441+addCol,430+addRow,28,28);  // 31 pixels right per point and 33 down for next row
        //one tile
        g.drawImage(one,437,728,49,49,null);


        /************************** WALL AREA ******************/
        // row 0
        //
        Tile[][]PTileWall=game.getCurrentPlayer().getWall().getTileWall();
        g.drawImage(PTileWall[0][0].getImage(),750,621,49,49,null);
        g.drawImage(PTileWall[0][1].getImage(),807,621,49,49,null);
        g.drawImage(PTileWall[0][2].getImage(),864,621,49,49,null);
        g.drawImage(PTileWall[0][3].getImage(),919,621,49,49,null);
        g.drawImage(PTileWall[0][4].getImage(),976,621,49,49,null);
        //row 1
        g.drawImage(PTileWall[1][0].getImage(),750,673,49,49,null);
        g.drawImage(PTileWall[1][1].getImage(),806,673,49,49,null);
        g.drawImage(PTileWall[1][2].getImage(),864,673,49,49,null);
        g.drawImage(PTileWall[1][3].getImage(),919,673,49,49,null);
        g.drawImage(PTileWall[1][4].getImage(),975,674,49,49,null);
        //row 2
        g.drawImage(PTileWall[2][0].getImage(),749,730,49,49,null);
        g.drawImage(PTileWall[2][1].getImage(),807,730,49,49,null);
        g.drawImage(PTileWall[2][2].getImage(),864,730,49,49,null);
        g.drawImage(PTileWall[2][3].getImage(),919,730,49,49,null);
        g.drawImage(PTileWall[2][4].getImage(),975,730,49,49,null);
        //row 3
        g.drawImage(PTileWall[3][0].getImage(),749,787,49,49,null);
        g.drawImage(PTileWall[3][1].getImage(),805,787,49,49,null);
        g.drawImage(PTileWall[3][2].getImage(),863,787,49,49,null);
        g.drawImage(PTileWall[3][3].getImage(),919,787,49,49,null);
        g.drawImage(PTileWall[3][4].getImage(),975,787,49,49,null);
        //row 4
        g.drawImage(PTileWall[4][0].getImage(),749,844,49,49,null);
        g.drawImage(PTileWall[4][1].getImage(),805,844,49,49,null);
        g.drawImage(PTileWall[4][2].getImage(),863,844,49,49,null);
        g.drawImage(PTileWall[4][3].getImage(),919,844,49,49,null);
        g.drawImage(PTileWall[4][4].getImage(),975,844,49,49,null);


        /************ PAREA ****************/

        //This for loop here is what draws out the player's entire PArea. Surprisingly, this is all you need
        int yPos = 621;
        for(int i = 0; i < 5; i++)
        {
            int xPos = 665;
            for(int j = 0; j < i + 1; j++)
            {
                if(game.getCurrentPlayer().getArea().getArea()[i][j] != 5)
                {
                    Tile temp = new Tile(game.getCurrentPlayer().getArea().getArea()[i][j]);
                    g.drawImage(temp.getImage(), xPos, yPos, 49, 49, null);
                    xPos -= 57;
                }
            }

            yPos += 55;
        }

        /* I commented this out because we may need it for reference later
        g.drawImage(black,665,621,49,49,null);
        //row 1
        g.drawImage(white,607,673,49,49,null);
        g.drawImage(white,665,673,49,49,null);
        //row 2
        g.drawImage(red,553,725,49,49,null);
        g.drawImage(red,607,725,49,49,null);
        g.drawImage(red,665,725,49,49,null);
        //row 3
        g.drawImage(blue,495,777,49,49,null);
        g.drawImage(blue,553,777,49,49,null);
        g.drawImage(blue,607,777,49,49,null);
        g.drawImage(blue,665,777,49,49,null);
        //row 4
        g.drawImage(yellow,437,829,49,49,null);
        g.drawImage(yellow,495,829,49,49,null);
        g.drawImage(yellow,553,829,49,49,null);
        g.drawImage(yellow,607,829,49,49,null);
        g.drawImage(yellow,665,829,49,49,null);
        */

        //
        ////floor line
        //
        Tile[]fTLine=game.getCurrentPlayer().getFloorLine().getFloorTLine();
        g.drawImage(fTLine[0].getImage(), 437, 940, 49, 49, null);
        g.drawImage(fTLine[1].getImage(), 499, 940, 49, 49, null);
        g.drawImage(fTLine[2].getImage(), 561, 940, 49, 49, null);
        g.drawImage(fTLine[3].getImage(), 623, 940, 49, 49, null);
        g.drawImage(fTLine[4].getImage(), 684, 940, 49, 49, null);
        g.drawImage(fTLine[5].getImage(), 746, 940, 49, 49, null);
        g.drawImage(fTLine[6].getImage(), 808, 940, 49, 49, null);

        /**************** OTHER PLAYER BOARDS ******************/

        //top board

        g.setColor(Color.BLACK);
        int addCol1,addRow1;
        addCol1=0;
        addRow1=0;
        if(game.getCurrentPlayer().getPoints()==0){         // need to add get other player method
            g.fillRect(1118,30,15,15);
        }
        else g.fillRect(1118+addCol1,47+addRow1,15,15);//add 15 for next column, add 17 for next row
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
        if(game.getCurrentPlayer().getPoints()==0){  //still need to add get other player method
            g.fillRect(1118,361,15,15);
        }
        else g.fillRect(1118+addCol2,379+addRow2,15,15);//add 15 for next column, add 17 for next row
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
        if(game.getCurrentPlayer().getPoints()==0){
            g.fillRect(1117,693,15,15);
        }
        else g.fillRect(1119+addCol2,711+addRow3,15,15);//add 15 for next column, add 17 for next row
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
        g.drawImage(black,1116,978,25,25,null);
        g.drawImage(black,1149,978,25,25,null);
        g.drawImage(black,1182,978,25,25,null);
        g.drawImage(black,1214,978,25,25,null);
        g.drawImage(black,1247,978,25,25,null);
        g.drawImage(black,1279,978,25,25,null);
        g.drawImage(black,1312,978,25,25,null);
        //
        //floor text
        //
        g.setFont(new Font("Comic Sans",Font.BOLD,43));

        g.drawString("- " + game.getFactoryFloor().getTileCount()[0],90,103);
        g.drawString("- " + game.getFactoryFloor().getTileCount()[1],90,161);
        g.drawString("- " + game.getFactoryFloor().getTileCount()[2],90,219);
        g.drawString("- " + game.getFactoryFloor().getTileCount()[3],90,277);
        g.drawString("- " + game.getFactoryFloor().getTileCount()[4],90,335);
        //
        //trash text
        //
        if(game.getTrash().getTrash()!=null) {
            g.drawString("- 0", 90, 424);
            g.drawString("- 0", 90, 482);
            g.drawString("- 0", 90, 540);
            g.drawString("- 0", 90, 598);
            g.drawString("- 0", 90, 656);
        }

        //this will draw the make-shift radio buttons lol
        if(game.getCurrentPlayer().canPlay())
        {
            g.drawImage(submitButton, 215, 820, 100, 50, null);

            g.setColor(Color.black);
            g.drawRect(361, 628, 30, 30);
            g.drawRect(361, 685, 30, 30);
            g.drawRect(361, 742, 30, 30);
            g.drawRect(361, 799, 30, 30);
            g.drawRect(361, 856, 30, 30);
            g.drawRect(361, 945, 30, 30);

            if(r1)
                g.fillRect(361, 628, 30, 30);
            if(r2)
                g.fillRect(361, 685, 30, 30);
            if(r3)
                g.fillRect(361, 742, 30, 30);
            if(r4)
                g.fillRect(361, 799, 30, 30);
            if(r5)
                g.fillRect(361, 856, 30, 30);
            if(r6)
                g.fillRect(361, 945, 30, 30);
        }

        //this draws the "Next" button when a player's turn ends
        if(!game.getCurrentPlayer().canPlay() && !game.getCurrentPlayer().canDraw())
            g.drawImage(nextButton, 215, 820, 100, 50, null);

        //this draws the player's names
        drawLog(logTxt.getText());
        if(game.getTurnNum()==0){
            g.drawImage(p1, 480, 396, 100, 28, null);
            g.drawImage(p2, 1150, 695, 50, 15, null);
            g.drawImage(p3, 1150, 363, 50, 15, null);
            g.drawImage(p4, 1150, 30, 50, 15, null);
        }
        else if(game.getTurnNum()==1){
            g.drawImage(p2, 480, 396, 100, 28, null);
            g.drawImage(p3, 1150, 695, 50, 15, null);
            g.drawImage(p4, 1150, 363, 50, 15, null);
            g.drawImage(p1, 1150, 30, 50, 15, null);
        }
        else if(game.getTurnNum()==2){
            g.drawImage(p3, 480, 396, 100, 28, null);
            g.drawImage(p4, 1150, 695, 50, 15, null);
            g.drawImage(p1, 1150, 363, 50, 15, null);
            g.drawImage(p2, 1150, 30, 50, 15, null);
        }
        else if(game.getTurnNum()==3){
            g.drawImage(p4, 480, 396, 100, 28, null);
            g.drawImage(p1, 1150, 695, 50, 15, null);
            g.drawImage(p2, 1150, 363, 50, 15, null);
            g.drawImage(p3, 1150, 30, 50, 15, null);
        }
    }

    /************************* ACTION PERFORMED ********************/

    public void actionPerformed(ActionEvent e) //really only necessary for the next player and submit buttons
    {

    }


    /********************* MOUSE CLICKED ************************/

    public void mouseClicked(MouseEvent e) //will be short because most code will be in the Click class
    {
        int x = e.getX();
        int y = e.getY();

        System.out.println("loc of click is (" + x + " , " + y + ")");


        if (game.getCurrentPlayer().canDraw()) { //here is what allows a player to draw
            Click c = new Click(x, y, game);
            TreeMap<Boolean, int[]> temp = c.draw(game.getFactories());

            boolean successful = temp.containsKey(true);

            if (!successful)
                return;

            ArrayList<Tile> tempHolder = game.getCurrentPlayer().getHolder();

            logTxt.setText(game.getCurrentPlayer().getName() + " got " + tempHolder.size() + " " + tempHolder.get(0).getColorName() + " tile(s)\n\n" + logTxt.getText());


            for (int i = 0; i < 5; i++) {
                Tile t = new Tile(i);

                if (temp.get(true)[i] != 0)
                    logTxt.setText( temp.get(true)[i] + " " + t.getColorName() + " tile(s) were/was put into the \nfactory floor\n\n"+ logTxt.getText());
            }

            logTxt.setText( "Please choose which row to place \nyour tiles in\n\n" + logTxt.getText());

            repaint();
        }

        //this below is the code for the make-shift Radio Buttons

        if (game.getCurrentPlayer().canPlay()) //this allows a player to select a radio button and submit their choice
        {
            if(x >= 361 && x <= 391)
            {
                if(y >= 628 && y <= 658) {
                    r1 = true;
                    r2 = false;
                    r3 = false;
                    r4 = false;
                    r5 = false;
                    r6 = false;
                    repaint();
                }
                else if(y >= 685 && y <= 715) {
                    r1 = false;
                    r2 = true;
                    r3 = false;
                    r4 = false;
                    r5 = false;
                    r6 = false;
                    repaint();
                }
                else if(y >= 742 && y <= 772) {
                    r1 = false;
                    r2 = false;
                    r3 = true;
                    r4 = false;
                    r5 = false;
                    r6 = false;
                    repaint();
                }
                else if(y >= 799 && y <= 829) {
                    r1 = false;
                    r2 = false;
                    r3 = false;
                    r4 = true;
                    r5 = false;
                    r6 = false;
                    repaint();
                }
                else if(y >= 856 && y <= 886) {
                    r1 = false;
                    r2 = false;
                    r3 = false;
                    r4 = false;
                    r5 = true;
                    r6 = false;
                    repaint();
                }
                else if(y >= 945 && y <= 975) {
                    r1 = false;
                    r2 = false;
                    r3 = false;
                    r4 = false;
                    r5 = false;
                    r6 = true;
                    repaint();
                }
            }

            if(x >= 215 && x <= 315 && y >= 820 && y <= 870) // choice submission
            {
                int holderLength = game.getCurrentPlayer().getHolder().size();
                String holderColor = game.getCurrentPlayer().getHolder().get(0).getColorName();

                if(r1)
                {
                    if(game.getCurrentPlayer().getArea().isValidPlacement(game.getCurrentPlayer().getHolder().get(0).getColor(), 0, game.getCurrentPlayer().getWall()))
                    {
                        System.out.println("this is hit right here");
                        game.getCurrentPlayer().setPArea(0, game.getTrash());
                        logTxt.setText(holderLength + " " + holderColor + " tile(s) were placed\n\n" + logTxt.getText());
                        game.getCurrentPlayer().setCanPlay(false);
                        repaint();
                        r1 = false;
                    }
                    else {
                        logTxt.setText(logTxt.getText() + "please choose a valid placement\n\n");
                        repaint();
                    }
                }
                else if(r2)
                {
                    if(game.getCurrentPlayer().getArea().isValidPlacement(game.getCurrentPlayer().getHolder().get(0).getColor(), 1, game.getCurrentPlayer().getWall()))
                    {
                        game.getCurrentPlayer().setPArea(1, game.getTrash());
                        logTxt.setText(holderLength + " " + holderColor + " tile(s) were placed\n\n" + logTxt.getText() );
                        game.getCurrentPlayer().setCanPlay(false);
                        repaint();
                        r2 = false;
                    }
                    else {
                        logTxt.setText(logTxt.getText() + "please choose a valid placement\n\n");
                        repaint();
                    }
                }
                else if(r3)
                {
                    if(game.getCurrentPlayer().getArea().isValidPlacement(game.getCurrentPlayer().getHolder().get(0).getColor(), 2, game.getCurrentPlayer().getWall()))
                    {
                        game.getCurrentPlayer().setPArea(2, game.getTrash());
                        logTxt.setText(logTxt.getText() + holderLength + " " + holderColor + " tile(s) were placed\n\n");
                        game.getCurrentPlayer().setCanPlay(false);
                        repaint();
                        r3 = false;
                    }
                    else {
                        logTxt.setText(logTxt.getText() + "please choose a valid placement\n\n");
                        repaint();
                    }
                }
                else if(r4)
                {
                    if(game.getCurrentPlayer().getArea().isValidPlacement(game.getCurrentPlayer().getHolder().get(0).getColor(), 3, game.getCurrentPlayer().getWall()))
                    {
                        game.getCurrentPlayer().setPArea(3, game.getTrash());
                        logTxt.setText(logTxt.getText() + holderLength + " " + holderColor + " tile(s) were placed\n\n");
                        game.getCurrentPlayer().setCanPlay(false);
                        repaint();
                        r4 = false;
                    }
                    else {
                        logTxt.setText(logTxt.getText() + "please choose a valid placement\n\n");
                        repaint();
                    }
                }
                if(r5)
                {
                    if(game.getCurrentPlayer().getArea().isValidPlacement(game.getCurrentPlayer().getHolder().get(0).getColor(), 4, game.getCurrentPlayer().getWall()))
                    {
                        game.getCurrentPlayer().setPArea(4, game.getTrash());
                        logTxt.setText(logTxt.getText() + holderLength + " " + holderColor + " tile(s) were placed\n\n");
                        game.getCurrentPlayer().setCanPlay(false);
                        repaint();
                        r5 = false;
                    }
                    else {
                        logTxt.setText(logTxt.getText() + "please choose a valid placement\n\n");
                        repaint();
                    }
                }
                else if(r6)
                {
                    game.getCurrentPlayer().setPArea(5, game.getTrash());
                    logTxt.setText(logTxt.getText() + holderLength + " " + holderColor + " tile(s) were placed\n\n");
                    game.getCurrentPlayer().setCanPlay(false);
                    repaint();
                    r6 = false;
                }
                x = 0;
                y = 0;
            }
        }

        if(!game.getCurrentPlayer().canPlay && !game.getCurrentPlayer().canDraw() && x >= 215 && x <= 315 && y >= 820 && y <= 870)
        {
            game.nextPlayer();
            logTxt.setText("-----------------------\n" + game.getCurrentPlayer().getName()+"'s turn\n" + "-----------------------\n\n"+ logTxt.getText());
            game.getCurrentPlayer().setCanDraw(true);
            repaint();
        }

    }
    public void drawLog(String s) //this method ensures the log remains on the frame after a repaint
    {
        this.remove(logPanel);

        logPanel = new JPanel();
        logPanel.setBounds(3, 664, 200, 312);
        logPanel.setPreferredSize(new Dimension(200, 312));
        logPanel.setLayout(new FlowLayout());


        //it can all be edited for convenience later.
        logTxt = new JTextArea(s);
        logTxt.setEditable(false);
        logTxt.setFont(new Font("SansSerif", Font.PLAIN, 10));
        logTxt.setLineWrap(true);
        logTxt.setEditable(false);
        logTxt.setVisible(true);


        log = new JScrollPane(logTxt);
        log.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        log.setPreferredSize(new Dimension(200, 312));

        logPanel.add(log);
        logPanel.setVisible(true);

        this.add(logPanel);
        this.setVisible(true);
    }

    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e) {}
}