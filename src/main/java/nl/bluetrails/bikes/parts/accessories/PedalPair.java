package nl.bluetrails.bikes.parts.accessories;

public class PedalPair {
    public PedalPair(){}
    String material;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPhotolink() {
        return photolink;
    }

    public void setPhotolink(String photolink) {
        this.photolink = photolink;
    }

    String brand;
    String photolink;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
