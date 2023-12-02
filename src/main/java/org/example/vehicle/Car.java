package org.example.vehicle;

public class Car extends Vehicle{

    private Gear gear;
    private CarType type;

    public Car(String make, String plate, String color, VehicleType category, Gear gear, CarType type){
        super(make,  plate,  color,  category);
        this.gear = gear;
        this.type = type;
    }
    // Gear Getter/ Setter
    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    // Type Getter/ Setter
    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }
}

