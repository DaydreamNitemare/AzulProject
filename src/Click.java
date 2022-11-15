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
            //factory 0
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
            //factory 1
            if(x>670 && y>42 && x<670+49&& y<42+49){
                factories[1].removeTiles(current, factories[1].getTile(0).getColor(), game.getFactoryFloor());
            }
            if(x>719 && y>42 && x<719+49&& y<42+49){
                factories[1].removeTiles(current, factories[1].getTile(1).getColor(), game.getFactoryFloor());
            }
            if(x>670 && y>91 && x<670+49&& y<91+49){
                factories[1].removeTiles(current, factories[1].getTile(2).getColor(), game.getFactoryFloor());
            }
            if(x>719 && y>91 && x<719+49&& y<91+49){
                factories[1].removeTiles(current, factories[1].getTile(3).getColor(), game.getFactoryFloor());
            }
            //factory 2
            if(x>807 && y>42 && x<807+49&& y<42+49){
                factories[2].removeTiles(current, factories[2].getTile(0).getColor(), game.getFactoryFloor());
            }
            if(x>856 && y>42 && x<856+49&& y<42+49){
                factories[2].removeTiles(current, factories[2].getTile(1).getColor(), game.getFactoryFloor());
            }
            if(x>807 && y>91 && x<807+49&& y<91+49){
                factories[2].removeTiles(current, factories[2].getTile(2).getColor(), game.getFactoryFloor());
            }
            if(x>856 && y>91 && x<856+49&& y<91+49){
                factories[2].removeTiles(current, factories[2].getTile(3).getColor(), game.getFactoryFloor());
            }
            //factory 3
            if(x>463 && y>164 && x<463+49&& y<164+49){
                factories[3].removeTiles(current, factories[3].getTile(0).getColor(), game.getFactoryFloor());
            }
            if(x>512 && y>164 && x<512+49&& y<164+49){
                factories[3].removeTiles(current, factories[3].getTile(1).getColor(), game.getFactoryFloor());
            }
            if(x>463 && y>213 && x<463+49&& y<213+49){
                factories[3].removeTiles(current, factories[3].getTile(2).getColor(), game.getFactoryFloor());
            }
            if(x>512 && y>213 && x<512+49&& y<213+49){
                factories[3].removeTiles(current, factories[3].getTile(3).getColor(), game.getFactoryFloor());
            }
            //factory 4
            if(x>670 && y>164 && x<670+49&& y<164+49){
                factories[4].removeTiles(current, factories[4].getTile(0).getColor(), game.getFactoryFloor());
            }
            if(x>719 && y>164 && x<719+49&& y<164+49){
                factories[4].removeTiles(current, factories[4].getTile(1).getColor(), game.getFactoryFloor());
            }
            if(x>670 && y>213 && x<670+49&& y<213+49){
                factories[4].removeTiles(current, factories[4].getTile(2).getColor(), game.getFactoryFloor());
            }
            if(x>719 && y>213 && x<719+49&& y<213+49){
                factories[4].removeTiles(current, factories[4].getTile(3).getColor(), game.getFactoryFloor());
            }
            //factory 5
            if(x>875 && y>164 && x<875+49&& y<164+49){
                factories[5].removeTiles(current, factories[5].getTile(0).getColor(), game.getFactoryFloor());
            }
            if(x>924 && y>164 && x<924+49&& y<164+49){
                factories[5].removeTiles(current, factories[5].getTile(1).getColor(), game.getFactoryFloor());
            }
            if(x>875 && y>213 && x<875+49&& y<213+49){
                factories[5].removeTiles(current, factories[5].getTile(2).getColor(), game.getFactoryFloor());
            }
            if(x>924 && y>213 && x<924+49&& y<213+49){
                factories[5].removeTiles(current, factories[5].getTile(3).getColor(), game.getFactoryFloor());
            }
            //factory 6
            if(x>535 && y>283 && x<535+49&& y<283+49){
                factories[6].removeTiles(current, factories[6].getTile(0).getColor(), game.getFactoryFloor());
            }
            if(x>584 && y>283 && x<584+49&& y<283+49){
                factories[6].removeTiles(current, factories[6].getTile(1).getColor(), game.getFactoryFloor());
            }
            if(x>535 && y>332 && x<535+49&& y<332+49){
                factories[6].removeTiles(current, factories[6].getTile(2).getColor(), game.getFactoryFloor());
            }
            if(x>584 && y>332 && x<584+49&& y<332+49){
                factories[6].removeTiles(current, factories[6].getTile(3).getColor(), game.getFactoryFloor());
            }
            //factory 7
            if(x>670 && y>283 && x<670+49&& y<283+49){
                factories[7].removeTiles(current, factories[7].getTile(0).getColor(), game.getFactoryFloor());
            }
            if(x>719 && y>283 && x<719+49&& y<283+49){
                factories[7].removeTiles(current, factories[7].getTile(1).getColor(), game.getFactoryFloor());
            }
            if(x>670 && y>332 && x<670+49&& y<332+49){
                factories[7].removeTiles(current, factories[7].getTile(2).getColor(), game.getFactoryFloor());
            }
            if(x>719 && y>332 && x<719+49&& y<332+49){
                factories[7].removeTiles(current, factories[7].getTile(3).getColor(), game.getFactoryFloor());
            }
            //factory 8
            if(x>807 && y>283 && x<807+49&& y<283+49){
                factories[8].removeTiles(current, factories[8].getTile(0).getColor(), game.getFactoryFloor());
            }
            if(x>856 && y>283 && x<856+49&& y<283+49){
                factories[8].removeTiles(current, factories[8].getTile(1).getColor(), game.getFactoryFloor());
            }
            if(x>807 && y>332 && x<807+49&& y<332+49){
                factories[8].removeTiles(current, factories[8].getTile(2).getColor(), game.getFactoryFloor());
            }
            if(x>856 && y>332 && x<856+49&& y<332+49){
                factories[8].removeTiles(current, factories[8].getTile(3).getColor(), game.getFactoryFloor());
            }
            drawSuccessful = true;
        }
        return drawSuccessful;
    }
}
