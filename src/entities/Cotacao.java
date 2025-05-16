package entities;

public class Cotacao {

    public static final double IOF = 6;

    public static double CalculoDolar(double price, double real) {
        return (real * price) * (1 + IOF / 100);
    }

}
