package org.example.vehicle;

public class Car extends Vehicle{

    private CarGear gear;
    private CarType type;

    Car(String make, String plate, String color, VehicleCategory category, CarGear gear, CarType type){
        super(make,  plate,  color,  category);
        this.gear = gear;
        this.type = type;
    }
    // Gear Getter/ Setter
    public CarGear getGear() {
        return gear;
    }

    public void setGear(CarGear gear) {
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

