package com.company.lab9and10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();

        Company company = new Company();

        for(int i = 0; i<180; i++){
            Operator operator = new Operator("Test", "Test", 10000 + (100000 - 10000) * r.nextDouble(), company);
            company.hire(operator);
            operator.calcSalary();
        }

        for(int i = 0; i<80; i++){
            Manager manager = new Manager("Test", "Test", 30000 + (300000 - 30000) * r.nextDouble(), company);
            company.hire(manager);
            manager.calcSalary();
        }

        for(int i = 0; i<10; i++){
            TopManager topManager = new TopManager("Test", "Test", 100000 + (1000000 - 100000) * r.nextDouble(), company);
            company.hire(topManager);
            topManager.calcSalary();
        }

        List<Employee> topSalaryStaff = company.getTopSalaryStaff(11);
        List<Employee> lowestSalaryStaff = company.getLowestSalaryStaff(30);

        System.out.println(lowestSalaryStaff);
        System.out.println(topSalaryStaff);

        System.out.println(company.getEmployeeList().size());

        ArrayList<Employee> firedEmployee = new ArrayList<>();
        for(int i = 0; i<company.getEmployeeList().size()/2; i++ ){
            firedEmployee.add(company.getEmployeeList().get(i));
        }

        for(Employee employee: firedEmployee){
            company.fire(employee);
        }

        System.out.println(company.getEmployeeList().size());
        

        System.out.println();


        List<Employee> topSalaryStaffAfterFire = company.getTopSalaryStaff(11);
        System.out.println(topSalaryStaffAfterFire);

        List<Employee> lowestSalaryStaffAfterFire = company.getLowestSalaryStaff(30);

        for(Employee employee: lowestSalaryStaffAfterFire){
            System.out.println(employee);
        }


    }
}
