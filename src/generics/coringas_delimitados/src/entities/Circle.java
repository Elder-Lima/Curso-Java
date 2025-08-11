package generics.coringas_delimitados.src.entities;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Double getRadius() {
        return this.radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
