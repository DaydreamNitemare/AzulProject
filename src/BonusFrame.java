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
    BufferedImage blue,yellow,red,black,white;

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
            blue= ImageIO.read(BonusFrame.class.getResource("/images/blueTile.png"));
            yellow = ImageIO.read(BonusFrame.class.getResource("/images/yellowTile.png"));
            red= ImageIO.read(BonusFrame.class.getResource("/images/redTile.png"));
            black= ImageIO.read(BonusFrame.class.getResource("/images/blackTile.png"));
            white= ImageIO.read(BonusFrame.class.getResource("/images/whiteTile.png"));

        }
        catch(Exception E)
        {
            System.out.println("Error with instantiating images in BonusFrame class");
        }

        this.addMouseListener(this);
        this.setIconImage(icon);

        game = g;

        game.getPlayers()[0].addPoints(game.getPlayers()[0].getWall().bonusPointsEarned()[0] + game.getPlayers()[0].getWall().bonusPointsEarned()[1] + game.getPlayers()[0].getWall().bonusPointsEarned()[2]);
        game.getPlayers()[1].addPoints(game.getPlayers()[1].getWall().bonusPointsEarned()[0] + game.getPlayers()[1].getWall().bonusPointsEarned()[1] + game.getPlayers()[1].getWall().bonusPointsEarned()[2]);
        game.getPlayers()[2].addPoints(game.getPlayers()[2].getWall().bonusPointsEarned()[0] + game.getPlayers()[2].getWall().bonusPointsEarned()[1] + game.getPlayers()[2].getWall().bonusPointsEarned()[2]);

        this.setVisible(true);
    }

    public void paint(Graphics g)
    {
        g.drawImage(background, 0, 30, 1440, 994, null); //draws the background

        g.drawImage(next, 670, 497, 100, 50, null);

        g.setFont(new Font("Comic Sans",Font.BOLD,12));
        g.drawString(game.getPlayers()[0].getWall().bonusPointsEarned()[0] + " points earned for completing rows.", 425, 150);
        g.drawString(game.getPlayers()[0].getWall().bonusPointsEarned()[1] + " points earned for completing columns.", 425, 175);
        g.drawString(game.getPlayers()[0].getWall().bonusPointsEarned()[2] + " points earned for collecting all tiles of one color.", 425, 200);

        g.drawString(game.getPlayers()[1].getWall().bonusPointsEarned()[0] + " points earned for completing rows.", 800, 150);
        g.drawString(game.getPlayers()[1].getWall().bonusPointsEarned()[1] + " points earned for completing columns.", 780, 175);
        g.drawString(game.getPlayers()[1].getWall().bonusPointsEarned()[2] + " points earned for collecting all tiles of one color.", 730, 200);

        g.drawString(game.getPlayers()[2].getWall().bonusPointsEarned()[0] + " points earned for completing rows.", 425, 650);
        g.drawString(game.getPlayers()[2].getWall().bonusPointsEarned()[1] + " points earned for completing columns.", 425, 675);
        g.drawString(game.getPlayers()[2].getWall().bonusPointsEarned()[2] + " points earned for collecting all tiles of one color.", 425, 700);

        g.drawString(game.getPlayers()[3].getWall().bonusPointsEarned()[0] + " points earned for completing rows.", 800, 650);
        g.drawString(game.getPlayers()[3].getWall().bonusPointsEarned()[1] + " points earned for completing columns.", 780, 675);
        g.drawString(game.getPlayers()[3].getWall().bonusPointsEarned()[2] + " points earned for collecting all tiles of one color.", 730, 700);

        g.setFont(new Font("Comic Sans", Font.BOLD, 42));
        g.drawString("Player 1", 175, 100);
        g.drawString("Player 2", 1100, 100);
        g.drawString("Player 3", 175, 600);
        g.drawString("Player 4", 1100, 600);


        g.setColor(Color.BLACK);
        Player[]playArr=game.getPlayers();
        //
        //
        //player 1
        //
        //


        int firstRow=1026;
        int firstCol=91;
        int addCol1=playArr[0].getPoints();
        if(playArr[0].getPoints()==0){
            g.fillRect(1118-firstRow,30+firstCol,15,15);
        }
        else if(playArr[0].getPoints()<21){
            int temp=addCol1;
            temp-=1;
            temp*=15;
            if(addCol1>=8)
                temp+=3;
            if(addCol1>=15)
                temp+=2;
            if(addCol1>=19)
                temp+=2;
            g.fillRect(1118+temp-firstRow,47+firstCol,15,15);//add 15 for next column, add 17 for next row
        }
        else if(playArr[0].getPoints()<41){
            int temp=((addCol1)%21);

            temp*=15;
            g.fillRect(1118+temp-firstRow,64+firstCol,15,15);
        }
        else if(playArr[0].getPoints()<61){
            int temp=((addCol1)%41);
            temp*=15;
            g.fillRect(1118+temp-firstRow,82+firstCol,15,15);
        }
        else if(playArr[0].getPoints()<81){
            int temp=((addCol1)%61);
            temp*=15;
            g.fillRect(1118+temp-firstRow,98+firstCol,15,15);
        }
        else {
            int temp=((addCol1)%81);
            temp*=15;
            g.fillRect(1118+temp-firstRow,115+firstCol,15,15);//add 15 for next column, add 17 for next roq
        }

        Tile[][]topWall=playArr[0].getWall().getTileWall();
        for(int x=0;x<5;x++){
            for(int y=0;y<5;y++){
            g.drawImage(topWall[y][x].getImage(),1281-firstRow+(x*30),147+firstCol+(y*30),25,25,null);
            }
        }
        Tile[][]topPA=playArr[0].getArea().getTileArea();
        for(int x=0;x<5;x++){
            for(int y=0;y<x+1;y++){
            g.drawImage(topPA[x][y].getImage(),1235-firstRow-(y*30),147+firstCol+(x*30),25,25,null);
            }
        }

        //2nd board
        //
        //
         firstRow=94;
         firstCol=91;
        Tile[][]secondWall=playArr[1].getWall().getTileWall();
        for(int x=0;x<5;x++){
            for(int y=0;y<5;y++){
                g.drawImage(topWall[y][x].getImage(),1281-firstRow+(x*30),147+firstCol+(y*30),25,25,null);
            }
        }
        Tile[][]secondPA=playArr[1].getArea().getTileArea();
        for(int x=0;x<5;x++){
            for(int y=0;y<x+1;y++){
                g.drawImage(topPA[x][y].getImage(),1235-firstRow-(y*30),147+firstCol+(x*30),25,25,null);
            }
        }
        //
        //point counter
        //
        if(playArr[1].getPoints()==0){
            g.fillRect(1118-firstRow,30+firstCol,15,15);
        }
        else if(playArr[1].getPoints()<21){
            int temp=addCol1;
            temp-=1;
            temp*=15;
            if(addCol1>=8)
                temp+=3;
            if(addCol1>=15)
                temp+=2;
            if(addCol1>=19)
                temp+=2;
            g.fillRect(1118+temp-firstRow,47+firstCol,15,15);//add 15 for next column, add 17 for next row
        }
        else if(playArr[1].getPoints()<41){
            int temp=((addCol1)%21);

            temp*=15;
            g.fillRect(1118+temp-firstRow,64+firstCol,15,15);
        }
        else if(playArr[1].getPoints()<61){
            int temp=((addCol1)%41);
            temp*=15;
            g.fillRect(1118+temp-firstRow,82+firstCol,15,15);
        }
        else if(playArr[1].getPoints()<81){
            int temp=((addCol1)%61);
            temp*=15;
            g.fillRect(1118+temp-firstRow,98+firstCol,15,15);
        }
        else {
            int temp=((addCol1)%81);
            temp*=15;
            g.fillRect(1118+temp-firstRow,115+firstCol,15,15);//add 15 for next column, add 17 for next roq
        }
        //
        //3rd board
        //
        //

        firstRow=1026;
        firstCol=591;
        Tile[][]thirdWall=playArr[2].getWall().getTileWall();
        for(int x=0;x<5;x++){
            for(int y=0;y<5;y++){
                g.drawImage(thirdWall[y][x].getImage(),1281-firstRow+(x*30),147+firstCol+(y*30),25,25,null);
            }
        }
        Tile[][]thirdPA=playArr[2].getArea().getTileArea();
        for(int x=0;x<5;x++){
            for(int y=0;y<x+1;y++){
                g.drawImage(thirdPA[x][y].getImage(),1235-firstRow-(y*30),147+firstCol+(x*30),25,25,null);
            }
        }
        if(playArr[2].getPoints()==0){
            g.fillRect(1118-firstRow,30+firstCol,15,15);
        }
        else if(playArr[2].getPoints()<21){
            int temp=addCol1;
            temp-=1;
            temp*=15;
            if(addCol1>=8)
                temp+=3;
            if(addCol1>=15)
                temp+=2;
            if(addCol1>=19)
                temp+=2;
            g.fillRect(1118+temp-firstRow,47+firstCol,15,15);//add 15 for next column, add 17 for next row
        }
        else if(playArr[2].getPoints()<41){
            int temp=((addCol1)%21);

            temp*=15;
            g.fillRect(1118+temp-firstRow,64+firstCol,15,15);
        }
        else if(playArr[2].getPoints()<61){
            int temp=((addCol1)%41);
            temp*=15;
            g.fillRect(1118+temp-firstRow,82+firstCol,15,15);
        }
        else if(playArr[2].getPoints()<81){
            int temp=((addCol1)%61);
            temp*=15;
            g.fillRect(1118+temp-firstRow,98+firstCol,15,15);
        }
        else {
            int temp=((addCol1)%81);
            temp*=15;
            g.fillRect(1118+temp-firstRow,115+firstCol,15,15);//add 15 for next column, add 17 for next roq
        }
        //
        //4th board
        //
        //
        firstRow=94;
        firstCol=591;

        if(playArr[3].getPoints()==0){
            g.fillRect(1118-firstRow,30+firstCol,15,15);
        }
        else if(playArr[3].getPoints()<21){
            int temp=addCol1;
            temp-=1;
            temp*=15;
            if(addCol1>=8)
                temp+=3;
            if(addCol1>=15)
                temp+=2;
            if(addCol1>=19)
                temp+=2;
            g.fillRect(1118+temp-firstRow,47+firstCol,15,15);//add 15 for next column, add 17 for next row
        }
        else if(playArr[3].getPoints()<41){
            int temp=((addCol1)%21);

            temp*=15;
            g.fillRect(1118+temp-firstRow,64+firstCol,15,15);
        }
        else if(playArr[3].getPoints()<61){
            int temp=((addCol1)%41);
            temp*=15;
            g.fillRect(1118+temp-firstRow,82+firstCol,15,15);
        }
        else if(playArr[3].getPoints()<81){
            int temp=((addCol1)%61);
            temp*=15;
            g.fillRect(1118+temp-firstRow,98+firstCol,15,15);
        }
        else {
            int temp=((addCol1)%81);
            temp*=15;
            g.fillRect(1118+temp-firstRow,115+firstCol,15,15);//add 15 for next column, add 17 for next roq
        }
        //wall
        Tile[][]fourthWall=playArr[3].getWall().getTileWall();
        for(int x=0;x<5;x++){
            for(int y=0;y<5;y++){
                g.drawImage(fourthWall[y][x].getImage(),1281-firstRow+(x*30),147+firstCol+(y*30),25,25,null);
            }
        }
        Tile[][]fourthPA=playArr[3].getArea().getTileArea();
        for(int x=0;x<5;x++){
            for(int y=0;y<x+1;y++){
                g.drawImage(fourthPA[x][y].getImage(),1235-firstRow-(y*30),147+firstCol+(x*30),25,25,null);
            }
        }
    }


    @Override
    public void mouseClicked(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();

        System.out.println("loc of click is (" + x + " , " + y + ")");

        if(x >= 670 && x <= 770 && y >= 497 && y <= 547)
        {
            this.dispose();
            new EndFrame(game); //not done yet will do in a minute
        }
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
