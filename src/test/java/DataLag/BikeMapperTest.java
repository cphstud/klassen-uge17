package DataLag;

import Model.Bike;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BikeMapperTest {
    BikeMapper bikeMapper;
    ArrayList<Bike> bikes;

    @Before
    public void setUp() throws Exception {
        bikeMapper = new BikeMapper();
        bikes = new ArrayList<>();
    }

    @Test
    public void getAllBikes() {
        bikes = bikeMapper.getAllBikes();

    }
}