package assignment.ch04.sub23.good;

public class Circle implements GoodFigure {

    final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }
}
