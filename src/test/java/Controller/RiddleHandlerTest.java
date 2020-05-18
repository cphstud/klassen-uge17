package Controller;

import DataMappers.RiddleMapper;
import Model.Player;
import Model.Riddle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RiddleHandlerTest {
    RiddleHandler rh;
    RiddleMapper rm;
    Riddle riddle;
    String answer;
    Player player;


    @Before
    public void setUp() throws Exception {
        rh = new RiddleHandler();
        player = new Player("Anton");
        riddle = new Riddle(3,"Square");
        riddle.setMessage("1,4,9,_,25,36");
        riddle.setSolution("16");
        riddle.setCategory("11");


    }

    @Test
    public void testUpdateRiddleSolve() {
        rh.updateRiddleSolve(riddle,answer,player);


    }
}