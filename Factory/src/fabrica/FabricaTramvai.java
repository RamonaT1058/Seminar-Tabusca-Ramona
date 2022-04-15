package fabrica;

import mijlocTransport.*;

public class FabricaTramvai implements AbstractFactory{
    @Override
    public MijlocTransport returneazaMijlocTransport(String nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}
