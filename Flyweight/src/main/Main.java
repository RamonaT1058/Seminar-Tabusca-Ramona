package main;

import flyweight.Autobuz;
import flyweight.LinieFactory;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("model1",2000,100);
        Autobuz autobuz2 = new Autobuz("model2",2001,110);
        Autobuz autobuz3 = new Autobuz("model3",2002,120);
        Autobuz autobuz4 = new Autobuz("model4",2003,130);

        LinieFactory factory = new LinieFactory();
        factory.getLinie(137).afiseazaDescriere(autobuz1);
        factory.getLinie(137).afiseazaDescriere(autobuz2);
        factory.getLinie(237).afiseazaDescriere(autobuz3);
        factory.getLinie(337).afiseazaDescriere(autobuz4);
    }
}
