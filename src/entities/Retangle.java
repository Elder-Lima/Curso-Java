package entities;

public class Retangle {
    public double width;
    public double height;

    public double Area() {
        return this.width * this.height;
    }

    public double Perimeter() {
        return 2 * (this.width + this.height);
    }

    public double Diagonal() {
        return Math.sqrt(Math.pow(this.width, 2) + (Math.pow(this.height, 2)));
    }

    public String toString() {
        return "AREA = " + Area() + " PERIMETER = " + Perimeter() + " DIAGONAL = " + Diagonal();
    }

}
