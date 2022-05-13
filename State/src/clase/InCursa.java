package clase;

public class InCursa implements State{
    @Override
    public void schimbaStarea(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaCapatDeLinie){
            System.out.println("Autobuzul cu numarul "+autobuz.getNrAutobuz()+" se afla in cursa.");
            autobuz.setStare(this);
        } else {
            System.out.println("Autobuzul nu poate pleca in cursa.");
        }
    }
}
