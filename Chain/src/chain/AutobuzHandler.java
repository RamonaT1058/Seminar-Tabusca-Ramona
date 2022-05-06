package chain;

public class AutobuzHandler extends MijlocTransportHandler{
    public AutobuzHandler(int pragSuperior) {
        super(pragSuperior);
    }

    @Override
    public void recomandaMijlocTransport(double distanta) {
        if(distanta < super.pragSuperior){
            System.out.println("Se recomanda folosirea autobuzului pentru distanta de " + distanta + " km.");
        } else {
            super.getUrmatorulMijlocTransport().recomandaMijlocTransport(distanta);
        }
    }
}
