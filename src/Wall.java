import java.util.*;
public class Wall {
    private int[][] pWall;
    Player p;
    public Wall(Player player){
        pWall = new int[5][5];
        for(int r=0; r<5; r++){
            for(int c =0;c<5;c++){
                pWall[r][c]=5;
            }
        }
        p=player;
    }
    public int[][] getWall(){
        return pWall;
    }

    public Tile[][] getTileWall(){
        Tile[][]pTWall = new Tile[5][5];
        for(int x=0;x<5;x++){
            for(int y=0;y<5;y++){
                Tile temp= new Tile(pWall[x][y]);
                pTWall[x][y]=temp;
            }
        }
        return pTWall;
    }
    public int set(int row, int col, int color){
        int p=0;
        pWall[row][col]=color;
        return p; //score later lol
    }
    public int scoreRight(int r, int c, int points){
        int i = points;
        if(c<4){
            if(pWall[r][c+1]!=5){
                i++;
                System.out.println("Right Score added : 1");
                return scoreRight(r, c+1, i);
            }
        }
        return i;
    }
    public int scoreLeft(int r, int c, int points){
        int i = points;
        if(c>0){
            if(pWall[r][c-1]!=5){
                i++;
                System.out.println("Left Score added : 1");
                return scoreLeft(r, c-1, i);
            }
        }
        return i;
    }
    public int scoreUp(int r, int c, int points){
        int i = points;
        if(r>0){
            if(pWall[r-1][c]!=5){
                i++;
                System.out.println("Up Score added : 1");
                return scoreUp(r-1, c, i);
            }
        }
        return i;
    }
    public int scoreDown(int r, int c, int points){
        int i = points;
        if(r<4){
            if(pWall[r+1][c]!=5){
                i++;
                System.out.println("Down Score added : 1");
                return scoreDown(r+1, c, i);
            }
        }
        return i;
    }
    public int score(int r, int c){
        int z = p.getArea().getArea()[r][0];
        pWall[r][c] = z;
        for(int[] x : pWall){
            for(int y : x){
                System.out.print(y);
            }
            System.out.println();
        }
        int totalScore=0;
        totalScore+=scoreRight(r, c, 0);
        totalScore+=scoreLeft(r, c, 0);
        totalScore+=scoreUp(r, c, 0);
        totalScore+=scoreDown(r, c, 0);
        totalScore+=1;
        return totalScore;
    }

    public boolean hasTilePlaced(int row, int color)
    {
        return pWall[row][(color + row) % 5] != 5;
    }

    public boolean rowIsFull()
    {
        for(int i = 0; i < 5; i ++)
        {
            boolean temp = true;
            for(int j = 0; j < 5; j++)
            {
                if(pWall[i][j] == 5)
                    temp = false;
            }
            if(temp)
                return temp;
        }

        return false;
    }
}