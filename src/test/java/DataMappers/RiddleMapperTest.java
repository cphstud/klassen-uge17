package DataMappers;

import Model.Riddle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RiddleMapperTest {
    RiddleMapper riddleMapper;
    Riddle riddle;

    @Before
    public void setUp() throws Exception {
        riddleMapper = new RiddleMapper();
        riddle = new Riddle(3,"Square");
        riddle.setMessage("1,4,9,_,25,36");
        riddle.setSolution("16");
        riddle.setCategory("11");
    }

    @Test
    public void createRiddle() {
        riddleMapper.createRiddle(riddle);
    }

    @Test
    public void getAllRiddles() {
        ArrayList<Riddle> riddles = riddleMapper.getAllRiddles();

    }
}