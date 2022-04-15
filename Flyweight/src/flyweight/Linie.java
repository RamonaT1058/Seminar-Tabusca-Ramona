package flyweight;

public class Linie implements Flyweight{
    int nrLinie;
    String primaStatie;
    String ultimaStatie;

    public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    public int getNrLinie() {
        return nrLinie;
    }

    @Override
    public void afiseazaDescriere(Autobuz autobuz) {
        System.out.println(autobuz.toString()+toString());
    }
}
