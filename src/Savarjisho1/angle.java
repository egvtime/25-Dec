package Savarjisho1;

public class angle {
    private int AmountOfSides;
    private int[] SizeOfSides = new int[AmountOfSides];

    public angle(int amountOfSides, int[] sizeOfSides) {
        AmountOfSides = amountOfSides;
        SizeOfSides = sizeOfSides;
    }

    public int getAmountOfSides() {
        return AmountOfSides;
    }

    public void setAmountOfSides(int amountOfSides) {
        AmountOfSides = amountOfSides;
    }

    public void setSizeOfSides(int[] sizeOfSides) {
        SizeOfSides = sizeOfSides;
    }

    public int perimeter(){
        int perimeter = 0;
        for(int i = 0; i>AmountOfSides; i++){
            perimeter += SizeOfSides[i];
        }
        return perimeter;
    }

}
