package DEV277X;

import java.awt.*;

public class NinjaCat extends Critter{
    public NinjaCat() {
    }

    @Override
    public Action getMove(CritterInfo info) {
        return Action.RIGHT;
    }

    @Override
    public Color getColor() {
        return Color.black;
    }

    @Override
    public String toString() {
        return "NinjaCat{}";
    }
}

