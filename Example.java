import java.util.*;

abstract class Employee {
    String name;
    Employee(String name) { 
        this.name = name; }
    abstract double calculateSalary();
}

class FullTime extends Employee {
    double monthly;
    FullTime(String name, double monthly) { super(name); this.monthly = monthly; }
    double calculateSalary() { return monthly; }
}

class PartTime extends Employee {
    int hours; 
    double rate;
    PartTime(String name, int hours, double rate) { super(name); this.hours = hours; this.rate = rate; }
    double calculateSalary() { return hours * rate; }
}

public class Example {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new FullTime("Ravi", 40000));
        list.add(new PartTime("Anita", 80, 300));

        for (Employee e : list) {
            System.out.println(e.name + ": " + e.calculateSalary()); // runtime polymorphism
        }
    }
}