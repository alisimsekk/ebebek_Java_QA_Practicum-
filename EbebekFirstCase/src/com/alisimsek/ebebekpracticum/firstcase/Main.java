package com.alisimsek.ebebekpracticum.firstcase;

import java.util.Scanner;

public class Main {
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

        System.out.println(emp.toString());

    }
}
