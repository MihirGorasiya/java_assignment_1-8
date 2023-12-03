package org.example.contract;

import org.example.Employee;

public class Temporary extends Contract{
    private double hourlyWage;
    private double completedHours;

    public Temporary(double hourlyWage, double completedHours) {
        this.hourlyWage = hourlyWage;
        this.completedHours = completedHours;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getCompletedHours() {
        return completedHours;
    }

    public void setCompletedHours(double completedHours) {
        this.completedHours = completedHours;
    }

    @Override
    double accumulatedSalary(Employee emp) {
        return completedHours * hourlyWage;
    }
}
