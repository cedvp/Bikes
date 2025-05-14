package nl.bluetrails.bikes.parts;

public class BrakeSystem {
    public BrakeSystem(){}
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BrakeSystem(String type) {
        this.type = type;
    }

    public String toString() {
        return "Brakesystem{type='"
                + type
                + "'}";
    }
}
