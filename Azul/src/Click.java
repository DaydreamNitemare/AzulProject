import java.util.*;
import java.awt.*;
import javax.swing.*;
public class Click {
    private int xVal, yVal;
    private Player current;
    public Click(int x, int y, Player p) {
        xVal=x;
        yVal=y;
        current=p;
    }

    /*public boolean draw(){
        boolean drawSuccessful =false;
        //code (checks if player clicked in a valid spot, if yes, draw was successful)
        if(xVal>f1t1XMin && xVal<f1t1Xax && yVal>f1t1YMin && yVal<f1t1YMax){

            current.addToHolder(tile);
            drawSuccessful=true;
        }
        return drawSuccessful;
    }*/

}
