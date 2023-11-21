package org.example.vehicle;

public class Car extends Vehicle{

    private boolean gear;
    private boolean type;

    Car(String make, String plate, String color, int category, boolean gear, boolean type){
        super(make,  plate,  color,  category);
        this.gear = gear;
        this.type = type;
    }
    // Gear Getter/ Setter
    public boolean getGear() {
        return gear;
    }

    public void setGear(boolean gear) {
        this.gear = gear;
    }

    // Type Getter/ Setter
    public boolean getType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }
}
