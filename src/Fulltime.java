class FullTimeEmployee extends Employee implements Payable {
    public FullTimeEmployee(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 1.2; 
    }

    @Override
    public double getPaymentAmount() {
        return calculateSalary();
    }
}