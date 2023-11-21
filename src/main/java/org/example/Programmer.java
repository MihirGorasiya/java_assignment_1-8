package org.example;

import org.example.vehicle.Vehicle;

public class Programmer extends Employee{

    private int totalProjects;
    final private double GAIN_FACTOR_PROJECTS = 200;

    Programmer(String employeeName, int birthYear, double monthlyIncome, double occupationRate, Vehicle hasVehicle, int totalProjects){
        super(employeeName,  birthYear,  monthlyIncome,  occupationRate,  hasVehicle);
        this.totalProjects = totalProjects;
    }

    // Total Projects Getter Setters
    public int getTotalProjects() {
        return totalProjects;
    }

    public void setTotalProjects(int totalProjects) {
        this.totalProjects = totalProjects;
    }

    public double annualIncome(){
        return baseYearlyIncome()+(totalProjects*GAIN_FACTOR_PROJECTS);
    }
}
