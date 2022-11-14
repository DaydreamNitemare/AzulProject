import java.util.*;
import java.awt.*;
import javax.swing.*;
public class Click {
    private int x, y;
    private Game game;
    private Player current;
    public Click(int x, int y, Game g) {
        x=x;
        y=y;
        current= g.getCurrentPlayer();
        game = g;
    }

    public boolean draw(Factory[] factories){
        boolean drawSuccessful = false;
        //code (checks if player clicked in a valid spot, if yes, draw was successful)
        if(current.canDraw()){
            if(x>535 && y>42 && x<535+49&& y<42+49){
                factories[0].removeTiles(current, factories[0].getTile(0).getColor(), game.getFactoryFloor());
            }
            if(x>584 && y>42 && x<584+49&& y<42+49){
                factories[0].removeTiles(current, factories[0].getTile(1).getColor(), game.getFactoryFloor());
            }
            if(x>535 && y>91 && x<535+49&& y<91+49){
                factories[0].removeTiles(current, factories[0].getTile(2).getColor(), game.getFactoryFloor());
            }
            if(x>584 && y>91 && x<584+49&& y<91+49){
                factories[0].removeTiles(current, factories[0].getTile(3).getColor(), game.getFactoryFloor());
            }
            //PAUSE
            if(x>670 && y>42 && x<670+49&& y<42+49){
                factories[0].removeTiles(current, factories[1].getTile(0).getColor(), game.getFactoryFloor());
            }
            if(x>719 && y>42 && x<719+49&& y<42+49){
                factories[0].removeTiles(current, factories[1].getTile(1).getColor(), game.getFactoryFloor());
            }
            if(x>670 && y>91 && x<670+49&& y<91+49){
                factories[0].removeTiles(current, factories[1].getTile(2).getColor(), game.getFactoryFloor());
            }
            if(x>719 && y>91 && x<719+49&& y<91+49){
                factories[0].removeTiles(current, factories[1].getTile(3).getColor(), game.getFactoryFloor());
            }
            //PAUSE nah im done for today


            drawSuccessful = true;
        }
        return drawSuccessful;
    }

}
