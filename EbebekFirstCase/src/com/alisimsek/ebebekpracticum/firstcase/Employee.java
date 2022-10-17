package com.alisimsek.ebebekpracticum.firstcase;

import java.util.Scanner;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    //1.metod
    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        Scanner input = new Scanner(System.in);

        System.out.print("Çalışan Ad ve Soyadını giriniz : ");
        emp.setName(input.nextLine());

        System.out.print("Maaş giriniz : ");
        emp.setSalary(input.nextInt());

        System.out.print("Haftalık çalışma saatini giriniz : ");
        emp.setWorkHours(input.nextInt());

        System.out.print("İşe giriş yılını giriniz : ");
        emp.setHireYear(input.nextInt());

        System.out.println(emp);
        /*
        double tax = emp.tax(emp.getSalary());
        int bonus = emp.bonus(emp.getWorkHours());
        double raiseSalary = emp.raiseSalary(emp.getHireYear(), emp.getSalary(), emp.getWorkHours());
        double totalSalary = emp.getSalary() + bonus;
        double salaryWithTaxAndSalary = emp.getSalary() + bonus - tax;

        //System.out.println("tax : " + tax);
        //System.out.println("bonus : " + bonus);
        //System.out.println("raiseSalary : " + raiseSalary);
        //System.out.println("Total salary : " + totalSalary);
        //System.out.println("Salary with tax and bonus : " + salaryWithTaxAndSalary);

         */
    }


    //2.metod
    private double tax(int salary){
        if (salary >= 1000){
            return ((salary*3)/100);
        }
        return 0;
    }

    //3.metod
    private int bonus(int workHours){
        if (workHours >=40){
            return (workHours-40)*30*4;
        }
        return 0;
    }

    //4.metod
    private double raiseSalary(int hireYear, int salary, int workHours){
        double raiseSalary = 0;
        int currentYear = 2021;
        if ((currentYear-hireYear) <10){
            raiseSalary = ((salary + bonus(workHours) - tax(salary))*0.05);
        }
        else if ( 9<(currentYear-hireYear) && (currentYear-hireYear)<20 ){
            raiseSalary = ((salary + bonus(workHours) - tax(salary))*0.1);
        }
        else if ((currentYear-hireYear)>19){
            raiseSalary = ((salary + bonus(workHours) - tax(salary))*0.15);
        }
        return raiseSalary;
    }

    //5.metod
    @Override
    public String toString() {
        return  "\n"+
                "Name= " + getName() + "\n"+
                "Salary= " + getSalary() + "\n" +
                "WorkHours= " + getWorkHours() + "\n" +
                "HireYear= " + getHireYear() + "\n" +
                "Tax= " + tax(getSalary()) + "\n" +
                "Bonus= " + bonus(getWorkHours()) + "\n" +
                "RaiseSalary= " + raiseSalary(getHireYear(), getSalary(), getWorkHours()) + "\n" +
                "salaryWithTaxAndSalary= " + (getSalary() + bonus(getWorkHours()) - tax(getSalary())) + "\n" +
                "totalSalary= " + (getSalary() + bonus(getWorkHours()));
    }


}
