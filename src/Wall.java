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
        int tempScore = totalScore;
        totalScore+=scoreRight(r, c, 0);
        if (tempScore-totalScore<0){ totalScore++; tempScore=totalScore;}
        totalScore+=scoreLeft(r, c, 0);
        if (tempScore-totalScore<0){ totalScore++; tempScore=totalScore;}
        totalScore+=scoreUp(r, c, 0);
        if (tempScore-totalScore<0){ totalScore++; tempScore=totalScore;}
        totalScore+=scoreDown(r, c, 0);
        if (tempScore-totalScore<0){ totalScore++; tempScore=totalScore;}
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

    public int[] bonusPointsEarned()
    {
        int[] temp = {0, 0, 0};

        for(int i = 0; i < 5; i ++)
        {
            boolean rowFilled = true;
            for(int j = 0; j < 5; j++)
            {
                if(pWall[i][j] == 5)
                    rowFilled = false;
            }
            if(rowFilled)
                temp[0] += 2;
        }

        for(int j = 0; j < 5; j++)
        {
            boolean columnFilled = true;
            for(int i = 0; i < 5; i++)
            {
                if(pWall[i][j] == 5)
                    columnFilled = false;
            }
            if(columnFilled)
                temp[1] += 7;
        }

        for(int i = 0; i < 5; i++)
        {
            boolean allOfOneColor = true;
            ArrayList<Integer> row1 = new ArrayList<>();
            ArrayList<Integer> row2 = new ArrayList<>();
            ArrayList<Integer> row3 = new ArrayList<>();
            ArrayList<Integer> row4 = new ArrayList<>();
            ArrayList<Integer> row5 = new ArrayList<>();
            for(int j = 0; j < 5; j++)
            {
                row1.add(pWall[0][j]);
                row2.add(pWall[1][j]);
                row3.add(pWall[2][j]);
                row4.add(pWall[3][j]);
                row5.add(pWall[4][j]);
            }

            if(row1.contains(i) && row2.contains(i) && row3.contains(i) && row4.contains(i) && row5.contains(i))
                temp[2] += 10;
        }

        return temp;
    }
}