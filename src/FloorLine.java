import java.util.*;
public class FloorLine {
    private ArrayList<Tile> floorLine;

    public FloorLine() //constructor
    {
        floorLine = new ArrayList<Tile>();
    }
    public Tile[] getFloorTLine(){
        Tile[]temp=new Tile[7];
        for(int x=0;x<floorLine.size();x++){
            temp[x]=floorLine.get(x);
        }
        for(int x=floorLine.size();x<temp.length;x++){
            temp[x]=new Tile(5);
        }
        return temp;
    }
    /*
    this below adds a tile to a players floor line. If the floor line is filled, it would then put the tile
    into the given trash.
     */
    public void add(Tile t, Trash trash)
    {
        if(floorLine.size() < 7)
            floorLine.add(t);
        else
            trash.addToTrash(t);
    }

    /*
    this below will aid in scoring after a round has finished. The method will clear the players floor line
    and return how many points a player must lose because of penalties in their floor line.
     */
    public int score()
    {
        int size = floorLine.size();
        floorLine.clear();

        switch(size)
        {
            case 0:
                return 0;
            case 1:
                return -1;
            case 2:
                return -2;
            case 3:
                return -4;
            case 4:
                return -6;
            case 5:
                return -8;
            case 6:
                return -11;
            case 7:
                return 14;
        }

        return 100; //this is to satisfy the return statement and catch possible errors.
    }
}
