import java.util.*;
public class Factory
{
    ArrayList<Tile> tilesPresent;
    boolean empty;

    public Factory() //constructor
    {
        tilesPresent = new ArrayList<Tile>();
        empty = false;
    }

    /*
    this below removes all of the tiles from a factory. It will give all of the Tiles of color "color"
    to Player "p" and the rest will go to Floor "f". It will then set the Factory to empty
     */
    public int[] removeTiles(Player p, int color, Floor f)
    {
        int[] temp = {0, 0, 0, 0, 0};

        for(int i = 0; i < 4; i++)
        {
            if(tilesPresent.get(0).getColor() == color)
                p.addToHolder(tilesPresent.remove(0));
            else {
                temp[tilesPresent.get(0).getColor()]++;
                f.addTile(tilesPresent.remove(0));
            }
        }

        empty = true;

        return temp;
    }

    /*
    returns whether or not the Factory at hand is empty
     */
    public boolean isEmpty()
    {
        return empty;
    }

    /*
    adds one tile to a factory. I know we will be adding four at a time but it is easier to add just one at a time
    to ensure that nothing happens incorrectly if the bag every needs to be refilled. We will probably just loop
    this four times in the Game class. It also sets the Factory's empty status to false
     */
    public void addTile(Tile t)
    {
        tilesPresent.add(t);
        empty = false;
    }

    /*
    This returns the ArrayList<Tile> that the Factory holds. This will really only be needed for graphics
    purposes as we need to know what Tiles are held by a factory in order to display them on screen.
     */
    public ArrayList<Tile> getTilesPresent()
    {
        return tilesPresent;
    }
    
    public Tile getTile(int index)
    {
        return tilesPresent.get(index);
    }
}
