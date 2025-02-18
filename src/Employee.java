public abstract class Employee {
    protected String name;
    protected int id;
    protected double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + calculateSalary());
    }
}
