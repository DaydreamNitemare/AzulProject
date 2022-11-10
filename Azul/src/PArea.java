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


    public void setArea(int r, int color, int rowSpaces)
    {
        area[r][area[r].length - rowSpaces] = color;
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

    public ArrayList<Integer> getRowSpace(int row) //returns the colors present in a row (if any) and how many spaces are left in the row.
    {
        int count = 0;
        int color = 5;

        ArrayList<Integer> holder = new ArrayList<>();

        for(int i = 0; i < area[row].length; i++)
        {
            if(area[row][i] == 5)
                count++;
            else
                color = area[row][i];
        }

        holder.add(color);
        holder.add(count);

        return holder;
    }

}