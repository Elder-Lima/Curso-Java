package entities;

public class Funcionario {
    private int id;
    private String name;
    private double salary;

    public Funcionario() {
    }

    public Funcionario(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }


    public String toString() {
        return getId() + ", " + getName() + ", " + String.format("%.2f", getSalary());
    }

    public void increaseSalary(double percentage) {
        this.salary += this.salary * percentage / 100;
    }
}
