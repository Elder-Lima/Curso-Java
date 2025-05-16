package entities;

public class Celulares {
    public String modelo;
    public double preco;
    public int quantidade;

    public Celulares(String modelo, double preco, int quantidade) {
        this.modelo = modelo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double totalValorEstoque() {
        return this.quantidade * this.preco;
    }

    public void addEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeEstoque(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return modelo + ", Preço: $ " + String.format("%.2f", preco) + ", Estoque: " + quantidade + ", Total: " + String.format("%.2f", totalValorEstoque());
    }

}
