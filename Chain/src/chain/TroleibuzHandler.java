package chain;

public class TroleibuzHandler extends MijlocTransportHandler{
    public TroleibuzHandler(int pragSuperior) {
        super(pragSuperior);
    }

    @Override
    public void recomandaMijlocTransport(double distanta) {
        if(distanta < super.pragSuperior) {
            System.out.println("Se recomanda folosirea troleibuzului pentru distanta de " + distanta + " km.");
        } else {
            super.getUrmatorulMijlocTransport().recomandaMijlocTransport(distanta);
        }
    }
}
