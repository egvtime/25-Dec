package Savarjisho3;

abstract class Toy {
    protected double remainingCosts;

    public Toy(double remainingCosts) {
        this.remainingCosts = remainingCosts;
    }

    public abstract double calculatePrice();

    public double getRemainingCosts() {
        return remainingCosts;
    }

    public void setRemainingCosts(double remainingCosts) {
        this.remainingCosts = remainingCosts;
    }
}
