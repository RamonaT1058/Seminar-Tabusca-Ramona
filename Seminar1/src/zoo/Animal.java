package zoo;

public abstract class Animal {
    private String nume;

    abstract public void mananca(String mancare);

    public Animal(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
