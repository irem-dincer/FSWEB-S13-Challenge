package org.example;
import org.example.enums.Plan; //import enums package


public class Main {
    public static void main(String[] args) {

testProgram();

    }
    public static void testProgram() {
        // 1. create a health plan;
        Healthplan healthPlan = new Healthplan(1, "Temel Plan", Plan.BASIC);
        System.out.println("Health Plan:");
        System.out.println(healthPlan.toString());

        // 2. create an employee
        String[] plans = new String[3];
        Employee employee = new Employee(101, "Ali Yılmaz", "ali@sirket.com", "sifre123", plans);

        // adding an employee health plan
        employee.addHealthPlan(0, "Temel Plan");
        System.out.println("\nÇalışan Bilgileri:");
        System.out.println(employee.toString());

        // 3. create an company
        String[] employees = new String[3];
        Company company = new Company(1, "ABC Yazılım", 100000.0, employees);

        // adding an employee company
        company.addEmployee(0, "Ali Yılmaz");
        System.out.println("\nŞirket Bilgileri:");
        System.out.println(company.toString());

        // Encapsulation test;
        System.out.println("\nNegatif giro testi:");
        System.out.println("Önceki giro: " + company.getGiro());
        company.setGiro(-5000);
        System.out.println("Negatif değer atama sonrası giro: " + company.getGiro());
    }


}