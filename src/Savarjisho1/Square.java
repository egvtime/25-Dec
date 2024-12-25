package Savarjisho1;

public class Square extends angle {
    private int side;


    public Square(int side, int[] shape) {
        super(4, shape);
        this.side = side;
    }

    @Override
    public int perimeter(){
        return side*4;
    }
}
