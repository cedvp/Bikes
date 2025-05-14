package nl.bluetrails.bikes.parts;

public class Fork {
    public Fork(){}
    String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Fork(String material) {
        this.material = material;
    }

    public String toString() {
        return "Fork{material='"
                + material
                + "'}";
    }
}
