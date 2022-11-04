import java.util.ArrayList;

public class Trash
{
    ArrayList<Tile> trashArray;

    public Trash()
    {
        trashArray = new ArrayList<>();
    }

    public ArrayList<Tile> getTrash()
    {
        return trashArray;
    }

    public void addToTrash(Tile t)
    {
        trashArray.add(t);
    }

    public Tile removeFromTrash(int pos)
    {
        return trashArray.remove(pos);
    }
}
