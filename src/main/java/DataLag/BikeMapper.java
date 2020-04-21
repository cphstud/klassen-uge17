package DataLag;

import Model.Bike;
import Util.DBConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BikeMapper {
    public ArrayList<Bike> getAllBikes() {
        ArrayList<Bike> bikes = new ArrayList<>();
        Bike bike = null;
        //TODO: etableret JDBC cycle
        // get connection
        Connection connection = DBConnector.getInstance().getConnection();
        try {
            // get statement
            Statement statement = connection.createStatement();
            // executed noget sql
            String queryString = "SELECT * FROM bike";
            // fang resultatet
            ResultSet resultset = statement.executeQuery(queryString);
            // bearbejd resultatet java-mæssigt
            // samle alle rækker op, lav hver række til en java-type, put i liste
            //# BikeID, BikeBrand, Supplier, Category, Price
            //1, Nishiki, Fri Cykler, MTB, 1200
            while(resultset.next()) {
                int bikeID = resultset.getInt(1);
                bike = new Bike(bikeID);
                String bikeBrand = resultset.getString(2);
                bike.setBikeBrand(bikeBrand);
                String supplier = resultset.getString(3);
                bike.setSupplier(supplier);
                String category = resultset.getString("Category");
                bike.setCategory(category);
                double price = resultset.getDouble("Price");
                bike.setPrice(price);
                bikes.add(bike);
            }
        } catch (SQLException e) {
            System.out.println("Der var en fejl: " + e.getMessage());
        }
        return bikes;
    }
}
