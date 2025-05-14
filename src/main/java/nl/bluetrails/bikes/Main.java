package nl.bluetrails.bikes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import nl.bluetrails.bikes.parts.accessories.Saddle;
import nl.bluetrails.bikes.parts.wheels.Tire;
import nl.bluetrails.bikes.parts.wheels.Tube;
import nl.bluetrails.bikes.parts.wheels.Wheel;
import nl.bluetrails.bikes.parts.BrakeSystem;
import nl.bluetrails.bikes.parts.Fork;
import nl.bluetrails.bikes.parts.Frame;
import nl.bluetrails.bikes.parts.Handle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        Saddle saddle = new Saddle("blabla","Simplon","standard");
        Wheel frontWheel = new Wheel(
                new Tube("28x32","","french"),
                new Tire("Swiss"),
                "simplon"
        );
        Wheel backWheel = new Wheel(
                new Tube("28x32","","french"),
                new Tire("Swiss"),
                "simplon"
        );
        Handle handle = new Handle("race","black");
        Fork fork = new Fork("carbon");
        BrakeSystem brakeSystem = new BrakeSystem("hydraulic");
        Frame frame = new Frame("Simplon","58","Iniszio","blue-green","","Carbon", handle, fork, brakeSystem);
        Bike simplon = new Bike(saddle,frame,frontWheel,backWheel,null,"Simplon","Iniszio","08/01/2022",3999.0);
        // Convert to JSON
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(simplon);


// Pretty print JSON
        ObjectWriter writer = objectMapper.writerWithDefaultPrettyPrinter();
        String prettyJson = writer.writeValueAsString(objectMapper.readTree(json));
        System.out.println(prettyJson);

    }
}