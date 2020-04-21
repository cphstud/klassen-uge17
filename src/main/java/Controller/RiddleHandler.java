package Controller;

import DataMappers.RiddleMapper;
import Model.Player;
import Model.Riddle;

import java.util.ArrayList;

public class RiddleHandler {
    RiddleMapper rM;

    public RiddleHandler() {
        rM = new RiddleMapper();
    }

    public ArrayList<Riddle> getAllRiddles() {
        ArrayList<Riddle> riddles = new ArrayList<>();
        riddles = rM.getAllRiddles();
        return riddles;
    }

    public void updateRiddleSolve(Riddle riddle, String answer, Player player){
        riddle.setSolved(true);
        riddle.addSolver(player);
        rM.updateRiddle(Riddle riddle, String answer, Player player);
    }


    public boolean solveRiddle(Riddle riddle, String answer, Player player){
        boolean retVal = false;
        // TODO: add functionality to mapperclass
        if (riddle.getSolution(player).equals(answer) ) {
            retVal = true;
        }
        return retVal;
    }


    public Riddle getRiddle(Player player) {
        Riddle riddle = null;
        return riddle;
    }
}
