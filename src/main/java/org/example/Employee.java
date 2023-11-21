package org.example;

import java.util.Calendar;

//Employee class initialization
public class Employee {
    private final String employeeName;
    private int birthYear;
    private int age;
    private double monthlyIncome;
    private double occupationRate;

    private boolean hasVehicle;


    public Employee(String employeeName, int birthYear, double monthlyIncome, double occupationRate, boolean hasVehicle) {
        this.employeeName = employeeName;
        this.birthYear = birthYear;
        this.age = Calendar.getInstance().get(Calendar.YEAR) - birthYear;
        this.monthlyIncome = monthlyIncome;
        this.occupationRate = occupationRate;
        this.hasVehicle = hasVehicle;
    }

    //    name getter
    public String getEmployeeName(){
        return employeeName;
    }
//    birth year getter setter
    public int getBirthYear(){
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

//   Age getter setter
    public int getAge(){
        return age;
    }

    public void setAge() {
        this.age = Calendar.getInstance().get(Calendar.YEAR) - this.birthYear;
    }
//   Monthly Income getter setter
    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

//   Occupation rate getter setter
    public double getOccupationRate() {
        return occupationRate;
    }

    public void setOccupationRate(double occupationRate) {
        this.occupationRate = occupationRate;
    }

//  has Vehicle getter setter
    public boolean isHasVehicle() {
        return hasVehicle;
    }

    public void setHasVehicle(boolean hasVehicle) {
        this.hasVehicle = hasVehicle;
    }
}