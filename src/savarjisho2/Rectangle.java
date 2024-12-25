package savarjisho2;

public class Rectangle extends Triangle {
    int w;

    public Rectangle(int x, int y, String Name, int z, int w) {
        super(x, y, Name, z);
        this.w = w;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    @Override
    public int perimeter() {
        return x + y + z + w;
    }
}
