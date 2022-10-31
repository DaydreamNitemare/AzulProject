import java.util.ArrayList;
import java.util.Collections;

public class Bag {
    ArrayList<Tile> bag;
    ArrayList<Tile> activeBag;
    public Bag () {
        bag = new ArrayList<>();

        for (int i = 0; i < 20; i++) { // 20 is stand in for tile count;
            bag.add(new Tile((int)(Math.random() * 5) + 1));
        }
        Collections.shuffle(bag);
    }
    public Tile draw() {
        Tile a = activeBag.get(0);
        activeBag.remove(0);
        return a;
    }
    public void isEmpty () {
        // avoid soft copying
        Collections.shuffle(bag);
        activeBag.addAll(bag);
    }
}

