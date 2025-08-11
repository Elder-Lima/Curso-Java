package generics.bolsa_ninja.src.entities;

public class Pergaminho {

    private String conteudo;

    public Pergaminho(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    @Override
    public String toString() {
        return "Pergaminho: " + conteudo;
    }
}
