package mainSF;

import fabrica.Fabrica;
import simple_factory.MijlocTransport;
import simple_factory.TipMijlocTransport;

public class MainSF {

    public static void main(String[] args) {

        Fabrica fabrica = new Fabrica();
        MijlocTransport autobuz = fabrica.returneazaMijlocTransport(TipMijlocTransport.Autobuz, "B20SCC");
        MijlocTransport tramvai = fabrica.returneazaMijlocTransport(TipMijlocTransport.Tramvai, "B55CSS");
        MijlocTransport troleibuz = fabrica.returneazaMijlocTransport(TipMijlocTransport.Troleibuz, "B33CSC");

        autobuz.afisareNrInmatriculare();
        tramvai.afisareNrInmatriculare();
        troleibuz.afisareNrInmatriculare();
    }
}
