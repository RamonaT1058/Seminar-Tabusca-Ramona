package simple_factory;

public class Autobuz extends MijlocTransport{

    public Autobuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public void afisareNrInmatriculare() {
        System.out.println("Autobuzul are nr de inmatriculare: " + this.getNrInmatriculare());

    }
}
