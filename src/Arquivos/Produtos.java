package Arquivos;

public class Produtos {
    private String nome;
    private Double preco;
    private Integer estoque;

    public Produtos() {
    }

    public Produtos(String nome, Double preco, Integer estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getEstoque() {
        return this.estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public Double valueTotal() {
        return getPreco() * getEstoque();
    }

    @Override
    public String toString() {
        return getNome() +", " + valueTotal();
    }
}
