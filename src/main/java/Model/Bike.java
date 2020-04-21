package Model;
/*
            //# BikeID, BikeBrand, Supplier, Category, Price
            //1, Nishiki, Fri Cykler, MTB, 120
 */

public class Bike {
    int bikeID;
    String bikeBrand;
    String supplier;
    String Category;
    double price;

    public Bike(int bikeID) {
        this.bikeID = bikeID;
    }

    public int getBikeID() {
        return bikeID;
    }

    public String getBikeBrand() {
        return bikeBrand;
    }

    public void setBikeBrand(String bikeBrand) {
        this.bikeBrand = bikeBrand;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
            this.price = price;
        }
    }
