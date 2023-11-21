package org.example;

public class Manager extends Employee{

    private int totalTravelDay;
    private int totalClients;

    Manager(String employeeName, int birthYear, double monthlyIncome, double occupationRate, boolean hasVehicle,int  totalTravelDay, int totalClients){
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


}
