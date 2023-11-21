package org.example;

import org.example.vehicle.Vehicle;

public class Tester extends Employee{
    private int totalBugsSolved;
    final private double GAIN_FACTOR_ERROR = 10;
    Tester(String employeeName, int birthYear, double monthlyIncome, double occupationRate, Vehicle hasVehicle, int totalBugsSolved) {
        super(employeeName, birthYear, monthlyIncome, occupationRate, hasVehicle);
        this.totalBugsSolved = totalBugsSolved;
    }

//    total bugs solved getter setter
    public int getTotalBugsSolved() {
        return totalBugsSolved;
    }

    public void setTotalBugsSolved(int totalBugsSolved) {
        this.totalBugsSolved = totalBugsSolved;
    }

    public double annualIncome(){
        return baseYearlyIncome()+(totalBugsSolved*GAIN_FACTOR_ERROR);
    }
}
