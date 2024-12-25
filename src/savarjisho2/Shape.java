package savarjisho2;

public class Shape {
    int x;
    int y;
    String Name;

    public Shape(int x, int y, String Name) {
        this.x = x;
        this.y = y;
        this.Name = Name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int perimeter() {
        return x + y;
    }
}
