import java.util.ArrayList;
import java.util.Collections;

public class Bag {
    ArrayList<Tile> bag;
    ArrayList<Tile> dumbSolution;
    public Bag () { //constructor
        bag = new ArrayList<>();
        dumbSolution = new ArrayList<>();
        /*
        this section here gives the bag 20 of each color tile
        */

        for (int i = 0; i < 20; i++) {
            dumbSolution.add(new Tile(0));
        }

        for (int i = 0; i < 20; i++) {
            dumbSolution.add(new Tile(1));
        }

        for (int i = 0; i < 20; i++) {
            dumbSolution.add(new Tile(2));
        }

        for (int i = 0; i < 20; i++) {
            dumbSolution.add(new Tile(3));
        }

        for (int i = 0; i < 20; i++) {
            dumbSolution.add(new Tile(4));
        }
        bag.addAll(dumbSolution);
        Collections.shuffle(bag); //shuffles the bag
    }

    public void placeTiles(Factory f, Trash t) { //gives 4 tiles to a factory and refills the bag if necessary
        for(int i = 0; i < 4; i++)
        {
            f.addTile(bag.remove(0));
            if(bag.size() == 0)
                this.ifEmpty(t);
        }
    }

    public void ifEmpty (Trash t) //what to do when the bag runs out of Tiles
    {

        bag.addAll(dumbSolution);
        t.removeFromTrash();
        Collections.shuffle(bag); //shuffles the bag
    }
}
