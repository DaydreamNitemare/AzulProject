import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

class Tile {
    int color; //int color value
    BufferedImage tileImage; //BufferedImage associated with Tile

    public Tile(int c) { //constructor
        color = c; //sets the int value of the Tile

        try { //sets the BufferedImage that corresponds to the int value of the Tile
            switch (c) {
                case 0:
                    tileImage = ImageIO.read(Tile.class.getResource("/images/blueTile.png"));
                    break;
                case 1:
                    tileImage = ImageIO.read(Tile.class.getResource("/images/yellowTile.png"));
                    break;
                case 2:
                    tileImage = ImageIO.read(Tile.class.getResource("/images/redTile.png"));
                    break;
                case 3:
                    tileImage = ImageIO.read(Tile.class.getResource("/images/blackTile.png"));
                    break;
                case 4:
                    tileImage = ImageIO.read(Tile.class.getResource("/images/whiteTile.png"));
                    break;
            }
        }
        catch(Exception E)
        {
            System.out.println("error in the Tile class when setting images");
        }
    }

    public BufferedImage getImage() //returns the BufferedImage associated with the Tile
    {
        return tileImage;
    }

    public int getColor() //returns the int value of the Tiles color
    {
        return color;
    }
}