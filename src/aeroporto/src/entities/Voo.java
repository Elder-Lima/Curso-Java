package aeroporto.src.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Voo {

    private String codigoVoo;
    private String destino;
    private LocalDateTime data;
    private Aeronave aeronave;

    public Voo(String codigoVoo, String destino, LocalDateTime data, Aeronave aeronave) {
        this.codigoVoo = codigoVoo;
        this.destino = destino;
        this.data = data;
        this.aeronave = aeronave;
    }

    public String getCodigoVoo() {
        return codigoVoo;
    }

    public void setCodigoVoo(String codigoVoo) {
        this.codigoVoo = codigoVoo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    @Override
    public String toString() {
        return "Voo{" +
                "codigoVoo='" + codigoVoo + '\'' +
                ", destino='" + destino + '\'' +
                ", data=" + data +
                ", aeronave=" + aeronave +
                '}';
    }
}
