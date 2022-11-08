import java.util.*;
public class Wall {
    private int[][] pWall;
    public Wall(){
        pWall = new int[5][5];
        for(int r=0; r<5; r++){
            for(int c =0;c<5;c++){
                pWall[r][c]=5;
            }
        }
    }
    public int[][] getWall(){
        return pWall;
    }
    public int set(int row, int col){
        int p=0;
        pWall[row][col]=2;
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
}
