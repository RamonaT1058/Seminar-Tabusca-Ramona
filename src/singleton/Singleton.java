package singleton;

public class Singleton {

    private static Singleton instanta = null;     // = new Singleton();

    public static synchronized Singleton returnareInstanta() {
        if (instanta == null) instanta = new Singleton();
        return instanta;
    }
    //SA NU UITAM SA FACEM CONSTRUCTORUL PRIVAT!!!
    private Singleton(){
    }
}
