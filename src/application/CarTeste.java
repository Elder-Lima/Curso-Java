package application;

class Veiculo {
    String marca;

    Veiculo(String marca) {
        this.marca = marca;
        System.out.println("Construtor de Veiculo: " + marca);
    }
}

class Carro extends Veiculo {
    String modelo;

    Carro(String marca, String modelo) {
        super(marca); // Chama o construtor da superclasse
        this.modelo = modelo;
        System.out.println("Construtor de Carro: " + modelo);
    }
}

public class CarTeste {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla");
    }
}

