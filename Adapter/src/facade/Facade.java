package facade;

public class Facade {
    public static void deschideUsi(Autobuz autobuz){
        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
    }
    public static void punePeLiberUsi(Autobuz autobuz){
        autobuz.punePeLiberUsaFata();
        autobuz.punePeLiberUsaMijloc();
        autobuz.punePeLiberUsaSpate();
    }
}
