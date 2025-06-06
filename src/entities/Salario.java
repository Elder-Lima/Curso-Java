package entities;

public class Salario {
    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary() {
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage) {
        grossSalary += grossSalary * (percentage / 100);
    }

    public String toString() {
        return this.name +", $ "+ String.format("%.2f", NetSalary());
    }
}
