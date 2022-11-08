import java.util.*;
public class Player {
    String name; //gives the player a name. This may not every be referenced, but its useful to have one static variable
    PArea a; //gives the player a play area
    Wall w; //gives the player a wall
    FloorLine fl; //gives the player a FloorLine
    int points; //number of points a player has
    boolean canPlay, canDraw; //whether or not a player can draw tiles or is playing tiles
    ArrayList<Tile> holder; //where the tiles a player just picked up are stored

    public Player(String n) //constructor
    {
        name =n;
        a = new PArea();
        w = new Wall();
        fl = new FloorLine();
        holder = new ArrayList<Tile>();
    }
    public int getPoints() //returns the number of points a player has
    {
        return points;
    }

    public PArea getArea() //returns the players play area
    {
        return a;
    }

    public Wall getWall() //returns the players given wall area
    {
        return w;
    }

    public void addPoints(int x) //adds the given amount of points to the players score
    {
        points+=x; //x can be negative cus floorline
    }

    public FloorLine getFloorLine() //returns the players floor line
    {
        return fl;
    }

    public void addToFloor(Tile t) //adds one tile to the players floor line
    {
        fl.add(t);
    }

    public void addToHolder(Tile t) //adds the given tile to the players holder
    {
        holder.add(t);
    }
}
