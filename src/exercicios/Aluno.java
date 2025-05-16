package exercicios;

public class Aluno {
    private String nome;
    private int idade;
    private double altura;

    public Aluno(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}
