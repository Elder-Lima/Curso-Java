package exercicios;

public class Pensionato {
    private int room;
    private String name;
    private String email;

    public Pensionato(int room, String name, String email) {
        this.room = room;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public int getRoom() {
        return this.room;
    }

    public String toString() {
        return getRoom() + ": " + getName() + ", " + getEmail();
    };

}
