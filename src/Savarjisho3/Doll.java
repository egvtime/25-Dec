package Savarjisho3;

class Doll extends Toy {
    private double hairCost;
    private double clothesCost;

    public Doll(double hairCost, double clothesCost, double remainingCosts) {
        super(remainingCosts);
        this.hairCost = hairCost;
        this.clothesCost = clothesCost;
    }

    @Override
    public double calculatePrice() {
        return hairCost + clothesCost + remainingCosts;
    }

    public double getHairCost() {
        return hairCost;
    }

    public void setHairCost(double hairCost) {
        this.hairCost = hairCost;
    }

    public double getClothesCost() {
        return clothesCost;
    }

    public void setClothesCost(double clothesCost) {
        this.clothesCost = clothesCost;
    }
}