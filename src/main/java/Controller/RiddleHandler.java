package Controller;

import DataMappers.RiddleMapper;
import Model.Player;
import Model.Riddle;

public class RiddleHandler {
    RiddleMapper rM;

    public RiddleHandler() {
        rM = new RiddleMapper();
    }

    public Riddle getRiddle(Player player) {
        Riddle riddle = null;
        return riddle;
    }
}
