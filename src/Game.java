import java.util.ArrayList;

public class Game {
    Player[] players;
    int turnNum;
    Factory[] factories;
    Floor floor;
    Bag bag;
    Player currentPlayer;
    Trash trash;
    boolean phase;
    public Game()
    {

        players = new Player[]{new Player("Player 1"), new Player("Player 2"), new Player("Player 3"), new Player("Player 4")};
        currentPlayer = players[(int)(Math.random() * 3)];
        turnNum = (int)(Math.random() * 4);
        factories = new Factory[]{new Factory(), new Factory(), new Factory(), new Factory(), new Factory(), new Factory(), new Factory(), new Factory(), new Factory()};
        floor = new Floor();
        bag = new Bag();
        trash = new Trash();
        players[turnNum].changeOneTile();
        phase = false;
    }

    public Player getCurrentPlayer()
    {
        return players[turnNum];
    }

    public void nextPlayer()
    {
        turnNum++;
        turnNum %= 4;
        currentPlayer = players[turnNum];
    }
    public int getTurnNum(){
        return turnNum;
    }

    public void endRound()
    {
        for (int i = 0; i < players.length; i++) {
            if (players[i].hasOneTileInFloorLine()) {
                turnNum = i;
                currentPlayer = players[i];
                players[i].setCanDraw(true);
                players[i].setCanPlay(false);
                players[i].setOneTileTrue();
                players[i].changeOneTileInFloorLine();
            }
            else
            {
                players[i].setCanDraw(false);
                players[i].setCanPlay(false);
            }

            players[i].setHasBeenScored(false);
            players[i].setRowOfScoring(0);
        }

        phase = false;

        deal();

    }

    /*
    public Player[] endGame()
    {
        //will make this later
    }
    */


    public void deal()
    {
        for (int i = 0; i < 9; i++) {
            bag.placeTiles(factories[i], trash );
        }
    }

    public Factory[] getFactories()
    {
        return factories;
    }

    public Factory getFactory(int num)
    {
        return factories[num];
    }

    public Floor getFactoryFloor()
    {
        return floor;
    }
    public Trash getTrash(){ return trash; }

    public Player getPrevPlayer(){
        int temp=turnNum+3;
        return players[(temp)%4];
    }
    public Player getMidPlayer(){
        int temp= turnNum+2;
        return players[(temp)%4];
    }
    public Player getNextPlayer(){
        int temp= turnNum+1;
        return players[(temp)%4];
    }

    public boolean allFactoriesEmpty()
    {
        boolean temp = true;
        for(int i =0; i < factories.length; i++)
        {
            if(!factories[i].isEmpty())
                temp = false;
        }

        return temp;
    }

    public void setRoundCondition(boolean condition)
    {
        phase = condition;
    }

    public boolean hasRoundEnded()
    {
        return phase;
    }

    public boolean checkGameEnd() {
        return players[0].getWall().rowIsFull() || players[1].getWall().rowIsFull() || players[2].getWall().rowIsFull() || players[3].getWall().rowIsFull();
    }
}