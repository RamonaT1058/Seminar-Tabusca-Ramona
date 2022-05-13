package clase;

public class ComandaPlecareInCursa implements Comanda{
    Autobuz a;
    int linie;

    public ComandaPlecareInCursa(Autobuz a, int linie) {
        this.a = a;
        this.linie = linie;
    }

    @Override
    public void executa() {
        a.plecareInCursa(linie);
    }
}
