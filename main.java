public class Employee {
    //attributes created id , name and salary
    private int id;
    private String name;
    private double salary;
    //we created constructor with class name
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    //creating method raise salary
    public void raiseSalary(double percent) {
        double increase = salary * percent / 100.0;
        salary += increase;
    }

    //monthly salary * 12 =  annual salary
    public double getAnnualSalary() {
        return salary * 12;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }

}

//main

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "John Cena", 50000.0);
        System.out.println(employee);
    }
}