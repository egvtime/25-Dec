package Savarjisho4;

class DailyWageEmployee extends Employee {
    private int daysWorked;
    private double dailySalary;

    public DailyWageEmployee(String firstName, String lastName, String phoneNumber, int daysWorked, double dailySalary) {
        super(firstName, lastName, phoneNumber);
        this.daysWorked = daysWorked;
        this.dailySalary = dailySalary;
    }

    @Override
    public double getSalaryAmount() {
        return daysWorked * dailySalary;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }
}