package org.example.vehicle;
//  Vehicle class initialization
public class Vehicle {
    private String make;
    private String plate;
    private String color;
    private VehicleType category;

    public Vehicle(String make, String plate, String color, VehicleType category) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }
    //  Make getter setter
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    //  plate getter setter
    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    //  color getter setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //  category getter setter
    public VehicleType getCategory() {
        return category;
    }

    public void setCategory(VehicleType category) {
        this.category = category;
    }
}
