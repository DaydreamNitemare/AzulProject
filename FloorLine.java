import java.util.*;
public class FloorLine {
    private ArrayList<Tile> floorLine;
    public FloorLine(){
        floorLine = new ArrayList<Tile>();
    }
    public void add(Tile t){
        floorLine.add(t);
    }
    public int score(){
        int s =0;
        for(int i =0; i<floorLine.size(); i++){
            if(i<2){
                s--;
            }
            else if(i<5){
                s-=2;
            }
            else{
                s-=3;
            }
        }
        return s;
    }
}
