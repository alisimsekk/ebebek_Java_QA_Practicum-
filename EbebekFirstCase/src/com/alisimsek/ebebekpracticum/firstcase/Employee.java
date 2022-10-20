package com.alisimsek.ebebekpracticum.firstcase;

public class Employee {
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;

    //1.metod - Kurucu metod
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

    //2.metod - tax() fonksiyonu ile sadece salary’i uygulanan vergi hesaplanacak
    public double tax(int salary){
        if (salary >= 1000){
            return ((salary*3)/100);
        }
        return 0;
    }

    //3.metod
    public int bonus(int workHours){
        if (workHours >=40){
            return (workHours-40)*30;
        }
        return 0;
    }

    //4.metod - raiseSalary() hesaplarken vergi ve bonusları dikkate almalısınız.
    public double raiseSalary(int hireYear, int salary, int workHours){
        double raiseSalary = 0;
        int currentYear = 2021;
        if ((currentYear-hireYear) <10){
            raiseSalary = ( (salary + bonus(workHours) - tax(salary) )*0.05);
        }
        else if ( 9<(currentYear-hireYear) && (currentYear-hireYear)<20 ){
            raiseSalary = ( (salary + bonus(workHours) - tax(salary) )*0.1);
        }
        else if ((currentYear-hireYear)>19){
            raiseSalary = ( (salary + bonus(workHours) - tax(salary) )*0.15);
        }
        return raiseSalary;
    }

    //5.metod
    @Override
    public String toString() {
        double vergi_ve_bonus_ile_maas = this.salary + bonus(this.workHours) - tax(this.salary);
        return  "\n"+
                "Adı : " + this.name + "\n"+
                "Maaşı : " + this.salary + "\n" +
                "Çalışma Saati : " + this.workHours + "\n" +
                "Başlangıç Yılı : " + this.hireYear + "\n" +
                "Vergi : " + tax(this.salary) + "\n" +
                "Bonus : " + bonus(this.workHours) + "\n" +
                "Maaş Artışı : " + raiseSalary(this.hireYear, this.salary, this.workHours) + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + (vergi_ve_bonus_ile_maas) + "\n" +
                "Toplam Maaş : " + (vergi_ve_bonus_ile_maas + raiseSalary(this.hireYear, this.salary, this.workHours) );
    }


}
