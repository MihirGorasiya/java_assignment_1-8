package org.example;

import org.example.contract.Contract;
import org.example.vehicle.Car;
import org.example.vehicle.Motorcycle;
import org.example.vehicle.Vehicle;

public class Manager extends Employee{

    private int totalTravelDay;
    private int totalClients;

    final private double GAIN_FACTOR_CLIENT = 500;
    final private double GAIN_FACTOR_TRAVEL = 100;

    public Manager(String employeeName, int birtYear, int totalClients, int totalTravelDay){
        super(employeeName,birtYear, 0);
        this.totalClients = totalClients;
        this.totalTravelDay = totalTravelDay;
    }
    public Manager(String employeeName, int birtYear, int totalClients, int totalTravelDay, double occupationRate,Vehicle v){
        super(employeeName,birtYear, occupationRate,v);
        this.totalClients = totalClients;
        this.totalTravelDay = totalTravelDay;

    }
    public Manager(String employeeName, int birtYear, int totalClients, int totalTravelDay,Vehicle v){
        super(employeeName,birtYear, 0,v);
        this.totalClients = totalClients;
        this.totalTravelDay = totalTravelDay;

    }
    public Manager(String employeeName, int birtYear, int totalClients, int totalTravelDay, double occupationRate){
        super(employeeName,birtYear, occupationRate);
        this.totalClients = totalClients;
        this.totalTravelDay = totalTravelDay;
    }
    public Manager(String employeeName, int birthYear, double monthlyIncome, double occupationRate, Vehicle hasVehicle, int  totalTravelDay, int totalClients){
        super(employeeName,birthYear,monthlyIncome,occupationRate,hasVehicle);
        this.totalTravelDay = totalTravelDay;
        this.totalClients = totalClients;
    }

    // Total Travel Days getter/ setter
    public int getTotalTravelDay() {
        return totalTravelDay;
    }

    public void setTotalTravelDay(int totalTravelDay) {
        this.totalTravelDay = totalTravelDay;
    }

    // Total Clients getter/ setter
    public int getTotalClients() {
        return totalClients;
    }

    public void setTotalClients(int totalClients) {
        this.totalClients = totalClients;
    }

    public double annualIncome(){
        return baseYearlyIncome()+(totalClients*GAIN_FACTOR_CLIENT)+(totalTravelDay*GAIN_FACTOR_TRAVEL);
    }


}
