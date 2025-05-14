package nl.bluetrails.bikes.parts;

public class Frame {
    public Frame(){}
    String brand;
    String size;
    String colour;
    String photo;
    String material;
    String model;
    Handle handle;
    Fork fork;
    BrakeSystem brakeSystem;

    public Fork getFork() {
        return fork;
    }

    public void setFork(Fork fork) {
        this.fork = fork;
    }

    public Handle getHandle() {
        return handle;
    }

    public void setHandle(Handle handle) {
        this.handle = handle;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Frame(String brand, String model, String size, String colour, String photo, String material, Handle handle, Fork fork, BrakeSystem brakeSystem) {
        this.brand = brand;
        this.size = size;
        this.colour = colour;
        this.photo = photo;
        this.material = material;
        this.fork = fork;
        this.brakeSystem = brakeSystem;
        this.handle = handle;
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String toString() {
        return "Frame{brand='"
                + brand
                + "', size='"
                +size
                + "', colour='"
                +colour
                + "', photo='"
                +photo
                + "', material='"
                +material
                + "', model='"
                + model
                + "', fork='"
                + fork.toString()
                + "', brakesystem='"
                + brakeSystem.toString()
                + "'}";
    }
}
