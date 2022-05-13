package clase;

public class Autobuz {

    private State stare;
    private int nrAutobuz;

    public State getStare() {
        return stare;
    }

    public void setStare(State stare) {
        this.stare = stare;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public Autobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
        this.stare=new LaCapatDeLinie();
    }

    public void pleacaInCursa(){
        InCursa autobuzInCursa = new InCursa();
        autobuzInCursa.schimbaStarea(this);
    }

    public void intraInService(){
        LaReparat autobuzLaReparat = new LaReparat();
        autobuzLaReparat.schimbaStarea(this);
    }

    public void ieseDinService(){
        LaCapatDeLinie autobuzLaCapatDeLinie = new LaCapatDeLinie();
        autobuzLaCapatDeLinie.schimbaStarea(this);
    }

    public void ajungeLaCapatDeLinie(){
        LaCapatDeLinie laCapat = new LaCapatDeLinie();
        laCapat.schimbaStarea(this);
    }
}
