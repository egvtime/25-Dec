package Savarjisho1;

public class Triangles extends angle{
    private int side;


    public Triangles(int side, int[] shape) {
        super(3, shape);
        this.side = side;
    }

    @Override
    public int perimeter(){
        return side*3;
    }
}
