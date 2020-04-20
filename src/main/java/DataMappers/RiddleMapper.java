package DataMappers;
import Model.Riddle;
import Util.DBConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RiddleMapper {
    /*
        int level;
    String solution;
    String name;
    String category;
    boolean isSolved;
    String message;

    RiddleName` varchar(255) DEFAULT NULL,
  `CategoryName` varchar(255) DEFAULT NULL,
  `Message` varchar(255) DEFAULT NULL,
  `Level` int(11) DEFAULT NULL,
  `Solved` tinyint,
  '1', 'Fibonacchi', '11', '1,1,2,3,5,_,13', '3', '0', '8'

    public Riddle(int level, String name)  {
        this.level=level;
        this.name=name;
        this.isSolved=false;
    }
     */

    public ArrayList<Riddle> getAllRiddles() {
        String query = "";
        Riddle tmpRiddle = null;
        ArrayList<Riddle> riddles = new ArrayList<>();
        // TODO: The JDBC-cycle
        Connection conn = DBConnector.getInstance().getConnection();
        try {
            query = "SELECT * FROM riddles";
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            while(res.next()) {
                // laver en gåde per iteration og gemmer i listen
                int id = res.getInt(1);
                String name = res.getString(2);
                String category = res.getString(3);
                String message = res.getString(4);
                int level = res.getInt(5);
                String solution = res.getString(6);
                tmpRiddle = new Riddle(level,name);
                tmpRiddle.setCategory(category);
                tmpRiddle.setMessage(message);
                tmpRiddle.setSolution(solution);
                tmpRiddle.setId(id);
                riddles.add(tmpRiddle);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return riddles;
    }


    // Pizza-objekt --> Pizza-tabel-række
    /*
    RiddleID` int(11) NOT NULL AUTO_INCREMENT,
  `RiddleName` varchar(255) DEFAULT NULL,
  `CategoryName` varchar(255) DEFAULT NULL,
  `Message` varchar(255) DEFAULT NULL,
  `Level` int(11) DEFAULT NULL,
  `Solved` tinyint,
     */
    public int createRiddle(Riddle riddle) {
        int retVal = 0;
        String sqlQuery = "";
        Connection conn = DBConnector.getInstance().getConnection();

        String riddleName = riddle.getName();
        String categoryName = riddle.getCategory();
        String message = riddle.getMessage();
        int level = riddle.getLevel();
        int solved = 0;
        String solution = riddle.getSolution();
        sqlQuery = "Insert into riddles (RiddleName,CategoryName,Message,Level,Solved) "+
                "Values(\""+riddleName+"\",\""+categoryName+"\",\""+message+"\","+level+","+solved+")";
        // lave statement
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sqlQuery,Statement.RETURN_GENERATED_KEYS);
            ResultSet res = stmt.getGeneratedKeys();
            res.next();
            retVal =  res.getInt(1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return retVal;
    }
}
