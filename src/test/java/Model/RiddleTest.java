package Model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RiddleTest {
    Riddle riddle;
    int level;
    String solution;
    String name;
    boolean isSolved;
    String message;
    /*
        public Riddle(int level, String name)  {
        this.level=level;
        this.name=name;
        this.isSolved=false;
    }
     */


    @Before
    public void setUp() throws Exception {
        riddle = new Riddle(3,"Fibonacchi");
        riddle.setMessage("1,1,2,3,5,_,13");
        riddle.setSolution("8");
        riddle.solveRiddle("9");
    }

    @Test
    public void solveRiddleTest() {
        try {
            riddle.solveRiddle("8");
        } catch (AlreadySolvedException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getMessage() {
    }
}