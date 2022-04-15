package fabrica;

import mijlocTransport.MijlocTransport;

public interface AbstractFactory {
    public MijlocTransport returneazaMijlocTransport(String nrInmatriculare);
}
