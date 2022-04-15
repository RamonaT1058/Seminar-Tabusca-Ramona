package simple_factory;

public abstract class MijlocTransport {

    private String nrInmatriculare;

    public MijlocTransport(String nrInmatriculare) {
        this.nrInmatriculare=nrInmatriculare;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public abstract void afisareNrInmatriculare();
}
