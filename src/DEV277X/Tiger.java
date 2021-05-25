package DEV277X;

import java.awt.*;

public class Tiger extends Critter{
    private int cunter = 0;


    @Override
    public Action getMove(CritterInfo info) {
        cunter++;
        if (info.frontThreat() == true){
            return Action.INFECT;

        }
        else if(info.getFront()== Neighbor.WALL || info.getRight() == Neighbor.WALL){
            return Action.LEFT;
        }
        else if (info.getFront() == Neighbor.SAME){
            return Action.RIGHT;
        }
        else{
            return Action.HOP;
        }
    }

    @Override
    public Color getColor() {
        int n = (int) (Math.random()*3 + 1);
        if( n == 1){
            return Color.red;
        }
        else if (n == 2){
            return Color.blue;
        }
        else{
            return Color.gray;
        }
    }

    @Override
    public String toString() {
        return "TGR";
    }
}
