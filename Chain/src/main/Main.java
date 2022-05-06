package main;

import chain.*;

public class Main {

    public static void main(String[] args) {
        MijlocTransportHandler handlerAutobuz = new AutobuzHandler(5);
        MijlocTransportHandler handlerMetrou = new MetrouHandler(10000);
        MijlocTransportHandler handlerTramvai = new TramvaiHandler(10);
        MijlocTransportHandler handlerTroleibuz = new TroleibuzHandler(3);

        handlerTroleibuz.setUrmatorulMijlocTransport(handlerAutobuz);
        handlerAutobuz.setUrmatorulMijlocTransport(handlerTramvai);
        handlerTramvai.setUrmatorulMijlocTransport(handlerMetrou);

        handlerTroleibuz.recomandaMijlocTransport(2);
        handlerTroleibuz.recomandaMijlocTransport(4);
        handlerTroleibuz.recomandaMijlocTransport(9);
        handlerTroleibuz.recomandaMijlocTransport(12);
    }
}
