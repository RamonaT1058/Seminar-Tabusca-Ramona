package main;

import observer.Autobuz;
import observer.Calator;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz("Autobuzul a plecat de la capatul de linie");

        Calator c1=new Calator("Maria Ioana");
        Calator c2=new Calator("Mimi");
        Calator c3=new Calator("Corina");
        Calator c4=new Calator("Matei");

        autobuz.anuntaCalator();

        autobuz.eliminaObserver(c1);
        autobuz.adaugaObserver(c4);
        autobuz.adaugaObserver(c3);
        autobuz.adaugaObserver(c2);

        autobuz.anuntaCalator();
    }
}
