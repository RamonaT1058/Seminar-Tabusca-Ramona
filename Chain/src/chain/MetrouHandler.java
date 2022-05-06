package chain;

public class MetrouHandler extends MijlocTransportHandler{
    public MetrouHandler(int pragSuperior) {
        super(pragSuperior);
    }

    @Override
    public void recomandaMijlocTransport(double distanta) {
        if(distanta < super.pragSuperior){
        System.out.println("Se recomanda folosirea metroului pentru distanta de " + distanta + " km.");
    } else {
            super.getUrmatorulMijlocTransport().recomandaMijlocTransport(distanta);
        }
    }
}
