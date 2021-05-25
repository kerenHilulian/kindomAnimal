package DEV277X;

import java.awt.*;

public class WhiteTiger extends  Tiger{

    private boolean infact;

    @Override
    public Action getMove(CritterInfo info) {
        if (info.frontThreat() == true){
            infact = true;
        }
        else{
            infact = false;
        }
        return super.getMove(info);

    }

    @Override
    public Color getColor() {
        return Color.white;
    }

    @Override
    public String toString() {
        if (infact){
            return super.toString();
        }
        else{
            return "tgr";
        }

    }
}
