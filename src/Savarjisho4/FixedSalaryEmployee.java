package Savarjisho4;

class FixedSalaryEmployee extends Employee {
    private double salary;

    public FixedSalaryEmployee(String firstName, String lastName, String phoneNumber, double salary) {
        super(firstName, lastName, phoneNumber);
        this.salary = salary;
    }

    @Override
    public double getSalaryAmount() {
        return salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}