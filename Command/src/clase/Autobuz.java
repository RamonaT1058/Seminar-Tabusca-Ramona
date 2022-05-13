package clase;

public class Autobuz {
    private String nrInmatriculare;

    public Autobuz(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public void plecareInCursa(int linie){
        System.out.println("Autobuzul cu numarul de inmatriculare "+nrInmatriculare+" a plecat in cursa pe traseul "+ linie);
    }
}
