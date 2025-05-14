package nl.bluetrails.bikes.parts.accessories;

public class Saddle {
    public Saddle(){}
    String photo;
    String brand;
    String description;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Saddle(String photo, String brand, String description) {
        this.photo = photo;
        this.brand = brand;
        this.description = description;
    }
}
