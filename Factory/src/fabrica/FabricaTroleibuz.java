package fabrica;

import mijlocTransport.*;

public class FabricaTroleibuz implements AbstractFactory{
    @Override
    public MijlocTransport returneazaMijlocTransport(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
