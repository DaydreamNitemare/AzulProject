import java.util.ArrayList;

public class Game {
    Player[] players;
    int turnNum;
    Factory[] factories;
    Floor floor;
    Bag bag;

    public Game()
    {
        players = new Player[]{new Player("Player 1"), new Player("Player 2"), new Player("Player 3"), new Player("Player 4")};
        int turnNum = 0;
        factories = new Factory[]{new Factory(), new Factory(), new Factory(), new Factory(), new Factory(), new Factory(), new Factory(), new Factory(), new Factory()};
        floor = new Floor();
        bag = new Bag();
    }

    public Player getCurrentPlayer()
    {
        return players[turnNum];
    }

    public void nextPlayer()
    {
        //ashmeet make this
    }

    public void endRound()
    {
        //will make this later
    }

    /*
    public Player[] endGame()
    {
        //will make this later
    }
    */


    public void deal()
    {
        //TileBag already has one but we will just call it here
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