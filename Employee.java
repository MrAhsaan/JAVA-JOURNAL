package JOURNAL;
class Employee {
    protected String name;
    protected double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double basicSalary, double bonus) {
        super(name, basicSalary);
        this.bonus = bonus;
    }

    public void displayTotalSalary() {
        double total = basicSalary + bonus;
        System.out.println("Manager Name: " + name);
        System.out.println("Total Salary: " + total);
    }

    public static void main(String[] args) {
        Manager mgr = new Manager("Alice Jones", 60000, 15000);
        mgr.displayTotalSalary();
    }
}
