package observer;

public class Calator implements Observer{
    String nume;
    @Override
    public void primesteAnunt(String anunt) {
        System.out.println(nume+" Ai primit anuntul: "+anunt);
    }

    public Calator(String nume) {
        this.nume = nume;
    }
}
