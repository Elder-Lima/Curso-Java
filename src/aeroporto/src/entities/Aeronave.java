package aeroporto.src.entities;

public abstract class Aeronave {

    private Integer codigo;
    private String modelo;
    private Integer capacidade;

    private boolean disponibilidade = true;

    public Aeronave() {
    }

    public Aeronave(Integer codigo, String modelo, Integer capacidade) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.capacidade = capacidade;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Aeronave{" +
                "codigo=" + codigo +
                ", modelo='" + modelo + '\'' +
                ", capacidade=" + capacidade +
                '}';
    }
}
