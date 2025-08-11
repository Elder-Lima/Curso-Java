package generics.bolsa_ninja.src.entities;

public class CompanheiroNinja {

    private String nomeDoAnimal;

    public CompanheiroNinja(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    public String getNomeDoAnimal() {
        return this.nomeDoAnimal;
    }

    @Override
    public String toString() {
        return "Companheiro ninja: " + nomeDoAnimal;
    }
}
