package Controller;

import DataMappers.RiddleMapper;
import Model.Player;
import Model.Riddle;

import java.util.ArrayList;

public class RiddleHandler {
    ArrayList<Riddle> riddles;
    RiddleMapper rM;

    public RiddleHandler() {
        rM = new RiddleMapper();
        riddles = new ArrayList<Riddle>();
        riddles = rM.getAllRiddles();
    }

    public ArrayList<Riddle> getAllRiddles() {
        ArrayList<Riddle> riddles = new ArrayList<>();
        riddles = rM.getAllRiddles();
        return riddles;
    }

    public void updateRiddleSolve(Riddle riddle, String answer, Player player){
        riddle.setSolved(true);
        riddle.addSolver(player);
        rM.markRiddleAsSolved(riddle, answer, player);
    }


    public boolean solveRiddle(Riddle riddle, String answer, Player player){
        boolean retVal = false;
        // TODO: add functionality to mapperclass
        if (riddle.getSolution().equals(answer) && player.getRole().equals("admin") ) {
            retVal = true;
        }
        return retVal;
    }


    public Riddle getRiddleById(int id) {
        Riddle retValRiddle = null;
        for(Riddle r:riddles) {
            if (r.getId()== id)  {
                retValRiddle = r;
                return r;
            }
        }
        return retValRiddle;
    }
}
