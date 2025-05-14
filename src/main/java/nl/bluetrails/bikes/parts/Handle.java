package nl.bluetrails.bikes.parts;

public class Handle {
    public Handle(){}
    String type;
    String colour;

    public Handle(String type, String colour) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour, String type) {
        this.colour = colour;
    }
}
