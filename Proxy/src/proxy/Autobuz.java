package proxy;

public class Autobuz implements MijlocTransport{
    int numarPasageri;
    int numarLinie;

    public Autobuz(int numarPasageri, int numarLinie) {
        this.numarLinie=numarLinie;
        this.numarPasageri=numarPasageri;
    }

    public int getNumarPasageri() {
        return numarPasageri;
    }

    public void setNumarPasageri(int numarPasageri) {
        this.numarPasageri = numarPasageri;
    }

    public int getNumarLinie() {
        return numarLinie;
    }

    public void setNumarLinie(int numarLinie) {
        this.numarLinie = numarLinie;
    }

    @Override
    public void opresteLaStatie() {
        System.out.println("Autobuzul de ep linia "+this.getNumarLinie()+" cu " +this.getNumarPasageri()+ " pasageri a oprit in statie.");
    }
}
