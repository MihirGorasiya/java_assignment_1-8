package org.example;

public class Tester extends Employee{
    private int totalBugsSolved;

    Tester(String employeeName, int birthYear, double monthlyIncome, double occupationRate, boolean hasVehicle, int totalBugsSolved) {
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
}
