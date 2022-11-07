import java.util.*;
public class Player {
    private String name;
    private PArea a;
    private Wall w;
    private FloorLine fl;
    private int points;
    private boolean canPlay, canDraw;
    private ArrayList<Tile> holder;
    public Player(String n){
        name =n;
        a = new PArea();
        w = new Wall();
        fl = new FloorLine();
        holder = new ArrayList<Tile>;
    }
    public int getPoints(){
        return points;
    }
    public PArea getArea(){
        return a;
    }
    public Wall getWall(){
        return w;
    }
    public void setWall(int r, int c){
        w.set(r , c);
    }
    public void addPoints(int x){
        points+=x; //x can be negative cus floorline
    }
    public FloorLine getFloorLine(){
        return fl;
    }
    public void addToFloor(Tile t){
        fl.add(t);
    }
}
