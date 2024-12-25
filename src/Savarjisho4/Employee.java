package Savarjisho4;

abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected String phoneNumber;

    public Employee(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public abstract double getSalaryAmount();

}