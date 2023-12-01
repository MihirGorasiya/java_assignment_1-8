package org.example.contract;

import org.example.Employee;

public class Permanent extends Contract{
    private int workedDays;
    private double fixedMonthlySalary;
    private int children;
    private boolean civilStatus;
    private double premium;

    public int getWorkedDays() {
        return workedDays;
    }

    public void setWorkedDays(int workedDays) {
        this.workedDays = workedDays;
    }

    public double getFixedMonthlySalary() {
        return fixedMonthlySalary;
    }

    public void setFixedMonthlySalary(Employee emp) {
        this.fixedMonthlySalary = emp.getMonthlyIncome();
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public boolean isCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(boolean civilStatus) {
        this.civilStatus = civilStatus;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    @Override
    double accumulatedSalary(Employee emp) {
        return workedDays * (emp.getMonthlyIncome() + children * premium);
    }
}
