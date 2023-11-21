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
        this.occupationRate = capOccupation(occupationRate);
        this.hasVehicle = hasVehicle;
        System.out.println("We have new employee: "+ employeeName);
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
        this.occupationRate = capOccupation(occupationRate);
    }

//  has Vehicle getter setter
    public boolean isHasVehicle() {
        return hasVehicle;
    }

    public void setHasVehicle(boolean hasVehicle) {
        this.hasVehicle = hasVehicle;
    }

//    function to cap occupation rate as per requirements
    private double capOccupation(double occupationRate){
        if(occupationRate < 10)
            return 10;
        else if (occupationRate > 100)
            return 100;
        else
            return occupationRate;
    }
// Get Base Yearly Income
    public double baseYearlyIncome(){
        return 12*monthlyIncome*occupationRate;
    }
}