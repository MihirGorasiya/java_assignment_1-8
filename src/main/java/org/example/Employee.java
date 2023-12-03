package org.example;

import org.example.contract.Contract;
import org.example.vehicle.Vehicle;

import java.util.Calendar;

//Employee class initialization
public class Employee {
    private final String employeeName;
    private int birthYear;
    private int age;
    private double monthlyIncome;
    private double occupationRate;

    private Vehicle hasVehicle;
    private Contract contract;

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Employee(String employeeName, int birtYear, double occupationRate, Vehicle v){
        this.employeeName = employeeName;
        this.birthYear = birtYear;
        this.occupationRate = occupationRate;
        this.hasVehicle = v;
        age = Calendar.getInstance().get(Calendar.YEAR) - birthYear;
        System.out.println("We have a new employee: "+employeeName+", a "+this.getClass().getSimpleName()+".\n");
    }
    public Employee(String employeeName, int birtYear, double occupationRate){
        this.employeeName = employeeName;
        this.birthYear = birtYear;
        this.occupationRate = occupationRate;
        age = Calendar.getInstance().get(Calendar.YEAR) - birthYear;
        System.out.println("We have a new employee: "+employeeName+", a "+this.getClass().getSimpleName()+".\n");

    }
    public Employee(String employeeName, int birthYear, double monthlyIncome, double occupationRate, Vehicle hasVehicle) {
        this.employeeName = employeeName;
        this.birthYear = birthYear;
        this.age = Calendar.getInstance().get(Calendar.YEAR) - birthYear;
        this.monthlyIncome = monthlyIncome;
        this.occupationRate = capOccupation(occupationRate);
        this.hasVehicle = hasVehicle;
        System.out.println("We have a new employee: "+employeeName+", a "+this.getClass().getSimpleName()+".\n");
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
    public Vehicle isHasVehicle() {
        return hasVehicle;
    }

    public void setHasVehicle(Vehicle hasVehicle) {
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

    public void signContract(Contract contract){
        this.contract = contract;
    }

    public String contractInfo(){
        String marriedStatus = "";
        int noOfChildren = 0;
        int workDays = 0;
        double salary = 0;
        String position = this.getClass().getSimpleName();

        String ans = employeeName+" is a " + position  +". he is "+ marriedStatus +" and he/she has "+ noOfChildren+" children.\n" +
                "He/She has worked for "+workDays+" days and upon contract his/her monthly\n" +
                "salary is "+salary+".";
        return ans;
    }
}