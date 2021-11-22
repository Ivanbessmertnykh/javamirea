package com.company.lab9and10;

import java.util.List;

public class TopManager extends Employee implements EmployeePosition{
    public TopManager(String name, String family, double salary, Company company) {
        super(name, family, salary, company);
    }

    @Override
    public String getJobTitle() {
        return "Top Manager";
    }

    @Override
    public double calcSalary() {
        List<Employee> employeeList = company.getEmployeeList();
        int sumSalary = 0;
        for (Employee employee : employeeList){
            if(!(employee instanceof TopManager)){
                sumSalary += employee.salary;
            }
        }
        if (sumSalary > 10000000){
            this.salary = salary + (salary + salary/2);
            return salary;
        }else{
            return salary;
        }
    }

    @Override
    public String toString() {
        return "TopManager salary " + Math.round(salary) + " руб.";
    }
}
