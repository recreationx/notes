package Y1S2.SC2002.tut.tut3;

public class Circle extends Point {

    protected double radius;

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}
