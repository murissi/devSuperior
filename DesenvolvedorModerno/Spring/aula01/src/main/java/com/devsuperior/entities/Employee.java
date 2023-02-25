package com.devsuperior.entities;

import com.devsuperior.services.PensionService;
import com.devsuperior.services.TaxService;

public class Employee {
    private String name;
    private double grossSalary;




    public Employee(String name, double grossSalary) {
        this.name = name;
        this.grossSalary = grossSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }
}
