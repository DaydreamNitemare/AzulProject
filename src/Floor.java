public class Floor
{
    int numBlue, numWhite, numBlack, numRed, numYellow;
    boolean oneTile;
    public Floor() //constructor
    {
        numBlue = 0;
        numWhite = 0;
        numBlack = 0;
        numRed = 0;
        numYellow = 0;
    }

    /*
    adds a Tile "t" to the FactoryFloor
     */
    public void addTile(Tile t)
    {
        switch(t.getColor()) {
            case 0:
                numBlue++;
                break;
            case 1:
                numYellow++;
                break;
            case 2:
                numRed++;
                break;
            case 3:
                numBlack++;
                break;
            case 4:
                numWhite++;
                break;
        }
    }

    /*
    removes all of the tiles of the given color and puts them into the players holder
     */
    public void remove(Player p, int color)
    {
        switch(color) {
            case 0:
                for(int i = 0; i < numBlue; i++)
                    p.addToHolder(new Tile(0));
                    numBlue=0;
                break;
            case 1:
                for(int i = 0; i < numYellow; i++)
                    p.addToHolder(new Tile(1));
                    numYellow=0;
                break;
            case 2:
                for(int i = 0; i < numRed; i++)
                    p.addToHolder(new Tile(2));
                    numRed=0;
                break;
            case 3:
                for(int i = 0; i < numBlack; i++)
                    p.addToHolder(new Tile(3));
                    numBlack=0;
                break;
            case 4:
                for(int i = 0; i < numWhite; i++)
                    p.addToHolder(new Tile(4));
                    numWhite=0;
                break;
        }
    }

    /*
    we may not need this but its better to have it than to not. All it does is clear the FactoryFloor
     */
    public void clear()
    {
        numBlue = 0;
        numWhite = 0;
        numBlack = 0;
        numRed = 0;
        numYellow = 0;
    }

    /*
    returns whether or not the whole FactoryFloor is empty
     */
    public boolean isEmpty()
    {
        return numBlue == 0 && numWhite == 0 && numBlack == 0 && numRed == 0 && numYellow == 0;
    }

    /*
    This returns the counts of all of the Tile colors that may be present on the FactoryFloor.
    it returns it as an array just for safety. Again, really only needed for graphics purposes.
    Could be possibly used for checking if the Floor has any of a certain color but we will cross that bridge
    when we get there
     */
    public int[] getTileCount()
    {
        return new int[]{numBlue, numYellow, numRed, numBlack, numWhite};
    }
    public void changeOneTile(){
        oneTile = !oneTile;
    }
    public boolean hasOneTile(){
        return oneTile;
    }
}