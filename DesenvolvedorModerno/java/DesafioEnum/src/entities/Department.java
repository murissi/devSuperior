package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private int payday;

    private Adress adress;

    private List<Employee> employees = new ArrayList<>();

    public Department() {
    }

    public Department(String name, int payday, Adress adress) {
        this.name = name;
        this.payday = payday;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayday() {
        return payday;
    }

    public void setPayday(int payday) {
        this.payday = payday;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }

    public double payroll(){
        double sum = 0;
        for(Employee i: employees) {
            sum += i.getSalary();
        }
        return sum;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
