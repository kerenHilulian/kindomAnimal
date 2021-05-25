package DEV277X;

import java.awt.*;

public class Bear extends Critter{
    private boolean  polar;
    private int cunter = 0;

    public Bear(){
        this.polar = Math.random() < 0.5;
    }
    public Bear(boolean polar) {

        this.polar = polar;
    }

    @Override
    public Action getMove(CritterInfo info) {

        cunter++;

        if(info.frontThreat()){
            return Action.INFECT;
        }
        else if(info.getFront()==Neighbor.EMPTY){
            return Action.HOP;
        }
        else{
            return Action.LEFT;
        }
    }

    @Override
    public Color getColor() {
        if (this.polar == true) {
            return Color.white;
        }
        else{
            return Color.black;
        }

    }

    @Override
    public String toString() {
        if(cunter % 2 == 0) {
            return "/Bear{" +
                    "polar=" + polar +
                    '}';
        }
        else{
            return "()Bear{" +
                    "polar=" + polar +
                    '}';
        }
    }
}
