package fabrica;

import simple_factory.*;

public class Fabrica {

    public MijlocTransport returneazaMijlocTransport(TipMijlocTransport tipMijlocTransport, String nrInmatriculare){
        switch(tipMijlocTransport) {
            case Autobuz:
                return new Autobuz(nrInmatriculare);
            case Tramvai:
                return new Tramvai(nrInmatriculare);
            case Troleibuz:
                return new Troleibuz(nrInmatriculare);
            default:
                return null;
        }


    }
}
