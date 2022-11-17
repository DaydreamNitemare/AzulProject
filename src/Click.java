import java.util.TreeMap;

public class Click {
    private int x, y;
    private Game game;
    private Player current;
    public Click(int x, int y, Game g) {
        this.x=x;
        this.y=y;
        current= g.getCurrentPlayer();
        game = g;
    }

    public TreeMap<Boolean, int[]> draw(Factory[] factories){
        boolean drawSuccessful = false;
        int[] numThrownAway = {0, 0, 0, 0, 0};
        //code (checks if player clicked in a valid spot, if yes, draw was successfuly
            //factory 0
        if(x>535 && y>42 && x<535+49&& y<42+49){
            numThrownAway = factories[0].removeTiles(current, factories[0].getTile(0).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>584 && y>42 && x<584+49&& y<42+49){
            numThrownAway = factories[0].removeTiles(current, factories[0].getTile(1).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>535 && y>91 && x<535+49&& y<91+49){
            numThrownAway = factories[0].removeTiles(current, factories[0].getTile(2).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>584 && y>91 && x<584+49&& y<91+49){
            numThrownAway = factories[0].removeTiles(current, factories[0].getTile(3).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        //factory 1
        if(x>670 && y>42 && x<670+49&& y<42+49){
            numThrownAway = factories[1].removeTiles(current, factories[1].getTile(0).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>719 && y>42 && x<719+49&& y<42+49){
            numThrownAway = factories[1].removeTiles(current, factories[1].getTile(1).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>670 && y>91 && x<670+49&& y<91+49){
            numThrownAway = factories[1].removeTiles(current, factories[1].getTile(2).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>719 && y>91 && x<719+49&& y<91+49){
            numThrownAway = factories[1].removeTiles(current, factories[1].getTile(3).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        //factory 2
        if(x>807 && y>42 && x<807+49&& y<42+49){
            numThrownAway = factories[2].removeTiles(current, factories[2].getTile(0).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>856 && y>42 && x<856+49&& y<42+49){
            numThrownAway = factories[2].removeTiles(current, factories[2].getTile(1).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>807 && y>91 && x<807+49&& y<91+49){
            numThrownAway = factories[2].removeTiles(current, factories[2].getTile(2).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>856 && y>91 && x<856+49&& y<91+49){
            numThrownAway = factories[2].removeTiles(current, factories[2].getTile(3).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        //factory 3
        if(x>463 && y>164 && x<463+49&& y<164+49){
            numThrownAway = factories[3].removeTiles(current, factories[3].getTile(0).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>512 && y>164 && x<512+49&& y<164+49){
            numThrownAway = factories[3].removeTiles(current, factories[3].getTile(1).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>463 && y>213 && x<463+49&& y<213+49){
            numThrownAway = factories[3].removeTiles(current, factories[3].getTile(2).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>512 && y>213 && x<512+49&& y<213+49){
            numThrownAway = factories[3].removeTiles(current, factories[3].getTile(3).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        //factory 4
        if(x>670 && y>164 && x<670+49&& y<164+49){
            numThrownAway = factories[4].removeTiles(current, factories[4].getTile(0).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>719 && y>164 && x<719+49&& y<164+49){
            numThrownAway = factories[4].removeTiles(current, factories[4].getTile(1).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>670 && y>213 && x<670+49&& y<213+49){
            numThrownAway = factories[4].removeTiles(current, factories[4].getTile(2).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>719 && y>213 && x<719+49&& y<213+49){
            numThrownAway = factories[4].removeTiles(current, factories[4].getTile(3).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        //factory 5
        if(x>875 && y>164 && x<875+49&& y<164+49){
            numThrownAway = factories[5].removeTiles(current, factories[5].getTile(0).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>924 && y>164 && x<924+49&& y<164+49){
            numThrownAway = factories[5].removeTiles(current, factories[5].getTile(1).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>875 && y>213 && x<875+49&& y<213+49){
            numThrownAway = factories[5].removeTiles(current, factories[5].getTile(2).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>924 && y>213 && x<924+49&& y<213+49){
            numThrownAway = factories[5].removeTiles(current, factories[5].getTile(3).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        //factory 6
        if(x>535 && y>283 && x<535+49&& y<283+49){
            numThrownAway = factories[6].removeTiles(current, factories[6].getTile(0).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>584 && y>283 && x<584+49&& y<283+49){
            numThrownAway = factories[6].removeTiles(current, factories[6].getTile(1).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>535 && y>332 && x<535+49&& y<332+49){
            numThrownAway = factories[6].removeTiles(current, factories[6].getTile(2).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>584 && y>332 && x<584+49&& y<332+49){
            numThrownAway = factories[6].removeTiles(current, factories[6].getTile(3).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        //factory 7
        if(x>670 && y>283 && x<670+49&& y<283+49){
            numThrownAway = factories[7].removeTiles(current, factories[7].getTile(0).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>719 && y>283 && x<719+49&& y<283+49){
            numThrownAway = factories[7].removeTiles(current, factories[7].getTile(1).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>670 && y>332 && x<670+49&& y<332+49){
            numThrownAway = factories[7].removeTiles(current, factories[7].getTile(2).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>719 && y>332 && x<719+49&& y<332+49){
            numThrownAway = factories[7].removeTiles(current, factories[7].getTile(3).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        //factory 8
        if(x>807 && y>283 && x<807+49&& y<283+49){
            numThrownAway = factories[8].removeTiles(current, factories[8].getTile(0).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>856 && y>283 && x<856+49&& y<283+49){
            numThrownAway = factories[8].removeTiles(current, factories[8].getTile(1).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>807 && y>332 && x<807+49&& y<332+49){
            numThrownAway = factories[8].removeTiles(current, factories[8].getTile(2).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        if(x>856 && y>332 && x<856+49&& y<332+49){
            numThrownAway = factories[8].removeTiles(current, factories[8].getTile(3).getColor(), game.getFactoryFloor());
            drawSuccessful = true;
        }
        int[] lol = game.getFactoryFloor().getTileCount();
        if(x>40 && x<90 && y>122 && y<170){
            if(lol[1]!=0){
                game.getFactoryFloor().remove(current, 0);
                drawSuccessful=true;
            }
        }
        if(x>40 && x<90 && y>65 && y<112){
            if(lol[0]!=0){
                game.getFactoryFloor().remove(current, 1);
                drawSuccessful=true;
            }
        }
        if(x>40 && x<90 && y>179 && y<225){
            if(lol[2]!=0){
                game.getFactoryFloor().remove(current, 2);
                drawSuccessful=true;
            }
        }
        if(x>40 && x<90 && y>235 && y<284){
            if(lol[3]!=0){
                game.getFactoryFloor().remove(current, 3);
                drawSuccessful=true;
            }
        }
        if(x>40 && x<90 && y>292 && y<340){
            if(lol[4]!=0){
                game.getFactoryFloor().remove(current, 4);
                drawSuccessful=true;
            }
        }
        if(drawSuccessful) {
            current.setCanDraw(false);
            current.setCanPlay(true);
        }

        TreeMap<Boolean, int[]> temp = new TreeMap<>();
        temp.put(drawSuccessful, numThrownAway);
        return temp;
    }
}
