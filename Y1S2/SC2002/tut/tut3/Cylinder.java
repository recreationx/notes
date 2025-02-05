package Y1S2.SC2002.tut.tut3;

public class Cylinder extends Circle{
    protected double height;
    public Cylinder(int x, int y, double radius, double height) {
        super(x, y, radius);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public double area() {
        return (2 * Math.PI * this.radius * this.radius) + (2 * Math.PI * this.radius * this.height);
    }

    public double volume() {
        return (Math.PI * this.radius * this.radius * this.height); 
    }
}
