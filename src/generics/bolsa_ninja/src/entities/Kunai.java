package generics.bolsa_ninja.src.entities;

public class Kunai {

    private String nome;

    public Kunai(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String toString() {
        return "Kunai: " + nome;
    }
}
