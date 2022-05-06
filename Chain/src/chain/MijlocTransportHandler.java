package chain;

public abstract class MijlocTransportHandler {
    private MijlocTransportHandler urmatorulMijlocTransport;
    int pragSuperior;

    public MijlocTransportHandler getUrmatorulMijlocTransport() {
        return urmatorulMijlocTransport;
    }

    public void setUrmatorulMijlocTransport(MijlocTransportHandler urmatorulMijlocTransport) {
        this.urmatorulMijlocTransport = urmatorulMijlocTransport;
    }

    public MijlocTransportHandler(int pragSuperior) {
        super();
        this.urmatorulMijlocTransport = null;
        this.pragSuperior=pragSuperior;
    }

    public abstract void recomandaMijlocTransport(double distanta);
}
