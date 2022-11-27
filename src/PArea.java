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

    public boolean rowIsEmpty(int row) //returns regardless a given row is completely empty
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
    public boolean rowIsFull(int row)
    {
        for(int i = 0; i < area[row].length; i++)
            if(area[row][i] == 5)
                return false;

        return true;
    }

    public void clearRow(int row)
    {
        for(int i = 0; i < area[row].length; i++)
            area[row][i] = 5;
    }

    public int colorInRow(int row)
    {
        return area[row][0];
    }

    public boolean isValidPlacement(int color, int row, Wall wall)
    {
        if(row == 5)
            return true;

        if(!rowIsFull(row) && (color == colorInRow(row) || colorInRow(row) == 5) && !wall.hasTilePlaced(row, color))
            return true;
        return false;
    }

}