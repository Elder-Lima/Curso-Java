package generics.bolsa_ninja.src.entities;

public class Shuriken {

    private int tamanho;

    public Shuriken(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return  this.tamanho;
    }

    public String toString() {
        return "Shuriken de tamanho: " + tamanho;
    }
}
