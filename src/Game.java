import java.util.ArrayList;

public class Game {
    Player[] players;
    int turnNum;
    Factory[] factories;
    Floor floor;
    Bag bag;
    Player currentPlayer;
    Trash trash;
    public Game()
    {

        players = new Player[]{new Player("Player 1"), new Player("Player 2"), new Player("Player 3"), new Player("Player 4")};
        currentPlayer = players[(int)(Math.random() * 3)];
        turnNum = (int)(Math.random() * 4);
        factories = new Factory[]{new Factory(), new Factory(), new Factory(), new Factory(), new Factory(), new Factory(), new Factory(), new Factory(), new Factory()};
        floor = new Floor();
        bag = new Bag();
        trash = new Trash();
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

    public void endRound()
    {
        for (int i = 0; i < players.length; i++) {
            if (players[i].oneTile) {
                turnNum = i;
                currentPlayer = players[i];
            }
        }
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
}