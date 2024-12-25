package Savarjisho3;

class Car extends Toy {
    private double salonCost;
    private double wheelCost;
    private int wheelQuantity;

    public Car(double salonCost, double wheelCost, int wheelQuantity, double remainingCosts) {
        super(remainingCosts);
        this.salonCost = salonCost;
        this.wheelCost = wheelCost;
        this.wheelQuantity = wheelQuantity;
    }

    @Override
    public double calculatePrice() {
        return salonCost + (wheelCost * wheelQuantity) + remainingCosts;
    }

    public double getSalonCost() {
        return salonCost;
    }

    public void setSalonCost(double salonCost) {
        this.salonCost = salonCost;
    }

    public double getWheelCost() {
        return wheelCost;
    }

    public void setWheelCost(double wheelCost) {
        this.wheelCost = wheelCost;
    }

    public int getWheelQuantity() {
        return wheelQuantity;
    }

    public void setWheelQuantity(int wheelQuantity) {
        this.wheelQuantity = wheelQuantity;
    }
}
