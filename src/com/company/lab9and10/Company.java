package com.company.lab9and10;

import java.util.*;

public class Company {

    private List<Employee> employeeList = new ArrayList<>();

    private double income;

    public Company() {
        Random random = new Random();
        this.income = random.nextInt(140000 - 115000) + 115000;
    }

    public void hire(Employee employee) {
        employeeList.add(employee);
    }

    public void hireAll(List<Employee> employeeList) {
        employeeList.addAll(employeeList);
    }

    public void fire(Employee employee) {
        employeeList.remove(employee);
    }

    public double getIncome() {
        return income;
    }

    public List<Employee> getTopSalaryStaff(int count){
        TopSalaryComparator topSalaryComparator = new TopSalaryComparator();
        ArrayList<Employee> employees1 = new ArrayList<>(employeeList);
        Collections.sort(employees1, topSalaryComparator);
        return employees1.subList(0, count);
    }

    public List<Employee> getLowestSalaryStaff(int count){
        LowSalaryComparator lowSalaryComparator = new LowSalaryComparator();
        ArrayList<Employee> employees1 = new ArrayList<>(employeeList);
        Collections.sort(employees1, lowSalaryComparator);
        return employees1.subList(0, count);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    @Override
    public String toString() {
        return "Company{" +
                "employeeList=" + employeeList +
                ", income=" + income +
                '}';
    }
}
