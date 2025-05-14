package nl.bluetrails.bikes.parts.wheels;

public class Tube {
    public Tube(){}
    String size;
    String brand;
    String pipetteType;

    public Tube(String size, String brand, String pipetteType) {
        this.size = size;
        this.brand = brand;
        this.pipetteType = pipetteType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPipetteType() {
        return pipetteType;
    }

    public void setPipetteType(String pipetteType) {
        this.pipetteType = pipetteType;
    }

    public String toString() {
        return "Tube{size='"
                + size
                + "', pipetteType='"
                + pipetteType
                + "'}";
    }
}
