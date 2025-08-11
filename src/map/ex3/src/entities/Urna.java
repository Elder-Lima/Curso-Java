package map.ex3.src.entities;

public class Urna {

    private String candidato;
    private Integer votos;

    public Urna(String candidato, Integer votos) {
        this.candidato = candidato;
        this.votos = votos;
    }

    public String getCandidato() {
        return candidato;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }
}
