package org.example.vehicle;

public class Motorcycle extends Vehicle{
    private boolean sideCar;

    Motorcycle(String make, String plate, String color, int category, boolean sideCar){
        super(make, plate, color, category);
        this.sideCar = sideCar;
    }
    // SideCar Getter Setter
    public boolean isSideCar() {
        return sideCar;
    }

    public void setSideCar(boolean sideCar) {
        this.sideCar = sideCar;
    }
}
