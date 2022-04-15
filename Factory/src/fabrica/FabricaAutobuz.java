package fabrica;

import mijlocTransport.*;

public class FabricaAutobuz implements AbstractFactory{
    @Override
    public MijlocTransport returneazaMijlocTransport(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
