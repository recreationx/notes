package lab4.surfaceArea;

public class Circle extends Shape{
    public Circle(double radius) {
        super(radius, radius);
    }

    @Override
    public double calculateArea() {
        return Math.PI * super.calculateArea();
    }
}
