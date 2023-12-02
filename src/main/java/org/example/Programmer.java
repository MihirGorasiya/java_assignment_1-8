package org.example;

import org.example.vehicle.Vehicle;

public class Programmer extends Employee{

    private int totalProjects;
    final private double GAIN_FACTOR_PROJECTS = 200;

    public Programmer(String employeeName, int birthYear, int totalProjects){
        super(employeeName,birthYear,0);
        this.totalProjects = totalProjects;
    }
    public Programmer(String employeeName, int birthYear, int totalProjects, Vehicle v){
        super(employeeName,birthYear,0,v);
        this.totalProjects = totalProjects;
    }
    public Programmer(String employeeName, int birthYear, int totalProjects, double occupationRate){
        super(employeeName,birthYear,occupationRate);
        this.totalProjects = totalProjects;
    }
    public Programmer(String employeeName, int birthYear, int totalProjects, double occupationRate, Vehicle v){
        super(employeeName,birthYear,occupationRate,v);
        this.totalProjects = totalProjects;
    }

    public Programmer(String employeeName, int birthYear, double monthlyIncome, double occupationRate, Vehicle hasVehicle, int totalProjects){
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
