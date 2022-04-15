package simple_factory;

public class Tramvai extends MijlocTransport{

    public Tramvai(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public void afisareNrInmatriculare() {
        System.out.println("Tramvaiul are nr de inmatriculare: " + this.getNrInmatriculare());
    }
}
