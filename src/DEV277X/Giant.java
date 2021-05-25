package DEV277X;

import java.awt.*;

public class Giant extends Critter{
    private int cunter = 0;
    private int mod24 = 0;


    @Override
    public Action getMove(CritterInfo info) {

        cunter++;

        if (info.frontThreat() == true){
            return Action.INFECT;
        }
        else if(info.getFront()==  Neighbor.EMPTY){
            return Action.HOP;
        }
        else{
            return Action.RIGHT;
        }
    }

    @Override
    public Color getColor() {
        return Color.gray;
    }

    @Override
    public String toString() {
        mod24 = cunter % 24;
        if ((mod24 <= 6)&&( mod24 > 0)) {
            return "fee";
        }
        if (mod24 <= 12) {
            return "fie";
        }
        if (mod24 <= 18) {
            return "foe";
        }

        return "fum";

    }
}
