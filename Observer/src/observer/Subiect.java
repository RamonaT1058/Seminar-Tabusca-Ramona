package observer;

public interface Subiect{
    public void adaugaObserver(Observer obs);
    public void eliminaObserver(Observer obs);

    public void anuntaCalator();
}
