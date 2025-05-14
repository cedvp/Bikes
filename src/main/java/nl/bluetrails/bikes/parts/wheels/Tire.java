package nl.bluetrails.bikes.parts.wheels;

public class Tire {
    public Tire(){}
    String brand;
    String model;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Tire(String brand) {
        this.brand = brand;
    }


    @Override
    public String toString() {
        return "Tire{brand='"
                + brand
                + "', model='"
                + model
                + "'}";
    }
}
