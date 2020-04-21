package Util;

import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class DBConnectorTest {
    Connection connection;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getConnection() {
        connection = DBConnector.getInstance().getConnection();
        try {
            int retVal = connection.createStatement().getMaxRows();
            connection.createStatement().executeUpdate("insert into bike (bikebrand) values (\"Kurt\")");
            System.out.println(retVal);
            //System.out.println(retVal2);

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }

    }
}