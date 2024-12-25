package savarjisho2;

public class Triangle extends Shape{
    int z;

    public Triangle(int x, int y, int z, String Name) {
        super(x, y, Name);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public int perimeter() {
        return x + y + z;
    }
}
