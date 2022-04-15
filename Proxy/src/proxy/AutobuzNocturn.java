package proxy;

public class AutobuzNocturn implements MijlocTransport {

    Autobuz autobuz;

    public AutobuzNocturn(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteLaStatie() {
        if(autobuz.getNumarPasageri()>0){
            autobuz.opresteLaStatie();
        } else {
            System.out.println("Autobuzul se retrage la capat de linie");
        }
    }

    @Override
    public void setNrPasageri(int nrPasageri) {

    }


}
