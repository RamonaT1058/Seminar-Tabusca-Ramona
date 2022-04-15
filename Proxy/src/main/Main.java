package main;

import proxy.Autobuz;
import proxy.AutobuzNocturn;
import proxy.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz = new Autobuz(5, 2);
        autobuz.opresteLaStatie();

        MijlocTransport autobuzNoapte= new AutobuzNocturn((Autobuz) autobuz);
        autobuzNoapte.opresteLaStatie();

        autobuzNoapte.setNrPasageri(0);
        autobuzNoapte.opresteLaStatie();
    }
}
