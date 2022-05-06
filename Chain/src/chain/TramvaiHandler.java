package chain;

public class TramvaiHandler extends MijlocTransportHandler{
    public TramvaiHandler(int pragSuperior) {
        super(pragSuperior);
    }

    @Override
    public void recomandaMijlocTransport(double distanta) {
        if (distanta < super.pragSuperior) {
            System.out.println("Se recomanda folosirea tramvaiului pentru distanta de " + distanta + " km.");
        } else {
            super.getUrmatorulMijlocTransport().recomandaMijlocTransport(distanta);
        }
    }
}
