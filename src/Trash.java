import java.util.ArrayList;

public class Trash {
    ArrayList<Tile> trashArray;

    public Trash() {
        trashArray = new ArrayList<>();
    }

    public ArrayList<Tile> getTrash() {
        return trashArray;
    }

    public void addToTrash(Tile t) {
        trashArray.add(t);
    }

    public Tile removeFromTrash(int pos) {
        return trashArray.remove(pos);
    }

    public int[] getNumOfEachColor()
    {
        int[] temp = {0, 0, 0, 0, 0};
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < trashArray.size(); j++)
            {
                if(trashArray.get(j).getColor() == i)
                    temp[i]++;
            }
        }
        return temp;
    }
}
