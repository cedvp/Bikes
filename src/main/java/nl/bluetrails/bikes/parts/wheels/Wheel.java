package nl.bluetrails.bikes.parts.wheels;

public class Wheel {
    public Wheel(){}
    Tube tube;
    Tire tire;
    String brand;
    String model;

    public Tube getTube() {
        return tube;
    }

    public Wheel(Tube tube, Tire tire, String brand) {
        this.tube = tube;
        this.tire = tire;
        this.brand = brand;
        this.model = model;
    }

    public void setTube(Tube tube) {
        this.tube = tube;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString() {
        return "Wheel{brand='"
                + brand
                + "', model='"
                + model
                + "', tube="
                + tube.toString()
                + "', tire="
                + tire.toString()
                + "'}";
    }
}
