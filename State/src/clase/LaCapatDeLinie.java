package clase;

public class LaCapatDeLinie implements State{
    @Override
    public void schimbaStarea(Autobuz autobuz) {
        if(!(autobuz.getStare() instanceof InCursa)){
            System.out.println("Autobuzul cu numarul "+autobuz.getNrAutobuz()+" a ajuns la capat de linie.");
            autobuz.setStare(this);
        } else {
            System.out.println("Autobuzul nu poate ajunge la capat de linie.");
        }
    }
}
