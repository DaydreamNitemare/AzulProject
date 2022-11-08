import java.util.*;
public class PArea {
    private int[][] area;
    public PArea() //constructor
    {
        area = new int[5][];

        area[0] = new int[]{5};
        area[1] = new int[]{5, 5};
        area[2] = new int[]{5, 5, 5};
        area[3] = new int[]{5, 5, 5, 5};
        area[4] = new int[]{5, 5, 5, 5, 5};
    }

    public int[][] getArea() //returns the play area matrix
    {
        return area;
    }

    /*
    must be fixed to account for tiles that are already present in a row and for tiles to be placed in the provided
    floor line if a row is to overflow.
     */
    public void setArea(int r, int cnt, int color, FloorLine fl)
    {
        for(int i = 0; i < area[r].length; i++)
        {
            if(cnt>0)
            {
                area[r][i]=color;
                cnt--;
            }
        }
    }

    public boolean rowIsEmpty(int row) //returns whether or not a given row is completely empty
    {
        for(int i = 0; i < area[row].length; i++)
        {
            if(area[row][i] != 5)
                return false;
        }

        return true;
    }

}
