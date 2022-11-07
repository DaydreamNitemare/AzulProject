import java.util.*;
public class Wall {
    private int[][] pWall;
    public Wall(){
        pWall = new int[5][5];
    }
    public int[][] getWall(){
        return pWall;
    }
    public int set(int row, int col){
        int p=0;
        pWall[row][col]=2;
        return p; //score later lol
    }
}
