package org.example;

import org.example.contract.Contract;
import org.example.contract.Permanent;
import org.example.contract.Temporary;
import org.example.vehicle.Car;
import org.example.vehicle.Motorcycle;
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
        this.occupationRate = capOccupation(occupationRate);
        this.hasVehicle = v;
        age = Calendar.getInstance().get(Calendar.YEAR) - birthYear;
        System.out.println("We have a new employee: "+employeeName+", a "+this.getClass().getSimpleName()+".\n");
    }
    public Employee(String employeeName, int birtYear, double occupationRate){
        this.employeeName = employeeName;
        this.birthYear = birtYear;
        this.occupationRate = capOccupation(occupationRate);
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

    @Override
    public String toString() {
        String str = "Name: "+getEmployeeName() +", a "+getClass().getSimpleName() +"\n" +
                "Age: "+getAge()+"\n" +
                "Employee has a "+isHasVehicle().getClass().getSimpleName()+"\n" +
                "- make: "+ isHasVehicle().getMake()+"\n" +
                "- plate: "+isHasVehicle().getPlate()+"\n" +
                "- color: "+isHasVehicle().getColor()+"\n" +
                "- category: "+isHasVehicle().getCategory()+"\n";
        if (isHasVehicle().getClass().getSimpleName().equals("Car")){
            Car c = (Car) isHasVehicle();
            str+= "- gear type: "+c.getGear()+"\n";
            str+= "- type: Sport "+c.getType()+"\n";
        }
        if (isHasVehicle().getClass().getSimpleName().equals("Motorcycle")){
            Motorcycle m = (Motorcycle) isHasVehicle();
            if (m.isSideCar()){
                str+= "- with sidecar\n";
            }else{
                str+= "- without sidecar\n";
            }
        }
        if (getClass().getSimpleName().equals("Manager")){
            str+= getEmployeeName()+" has an Occupation rate: "+getOccupationRate()+" He/She travelled 6 days and\n" +
                    "has brought 30 new clients.\n" +
                    "His/Her estimated annual income is ";
        }

        return str;
    }

    public String contractInfo(){
        String marriedStatus = "";
        int noOfChildren = 0;
        int workDays = 0;
        double salary = 0;
        String position = this.getClass().getSimpleName();
        Contract cur;
        String ans = "";
        if(contract instanceof Permanent){
            cur = (Permanent)contract;
            noOfChildren = ((Permanent) cur).getChildren();
            marriedStatus = ((Permanent) cur).isMarried() ? "married" : "not married";
            workDays = ((Permanent) cur).getWorkedDays();
            salary = ((Permanent) cur).getFixedMonthlySalary();
            ans = employeeName+" is a " + position  +". he is "+ marriedStatus +" and he/she has "+ noOfChildren+" children.\n" +
                    "He/She has worked for "+workDays+" days and upon contract his/her monthly\n" +
                    "salary is "+salary+".\n";
        }else if(contract instanceof Temporary){
            cur = (Temporary)contract;
            ans = "Paul is a "+ position +". he is a temporary employee with "+((Temporary) cur).getHourlyWage()+"\nhourly salary and he has worked for "+((Temporary) cur).getCompletedHours()+" hours.\n";
        }
        return ans;
    }
}