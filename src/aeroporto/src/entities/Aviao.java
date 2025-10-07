package aeroporto.src.entities;

public class Aviao extends Aeronave{

    private boolean disponibilidade = true;

    public Aviao() {
    }

    public Aviao(Integer codigo, String modelo, Integer capacidade, boolean disponibilidade) {
        super(codigo, modelo, capacidade);
        this.disponibilidade = disponibilidade;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Aviao{" +
                "disponibilidade=" + disponibilidade +
                '}';
    }
}
