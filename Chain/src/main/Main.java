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

        MijlocTransportHandler handlerMetrouCluj = new MetrouHandler(2);
        MijlocTransportHandler handlerAutobuzCluj = new AutobuzHandler(100000);
        MijlocTransportHandler handlerTramvaiCluj = new TramvaiHandler(4);
        MijlocTransportHandler handlerTroleibuzCluj = new TroleibuzHandler(6);

        handlerMetrouCluj.setUrmatorulMijlocTransport(handlerTramvaiCluj);
        handlerTramvaiCluj.setUrmatorulMijlocTransport(handlerTroleibuzCluj);
        handlerTroleibuzCluj.setUrmatorulMijlocTransport(handlerAutobuzCluj);

        handlerMetrouCluj.recomandaMijlocTransport(5);
        handlerMetrouCluj.recomandaMijlocTransport(1);
        handlerMetrouCluj.recomandaMijlocTransport(25);

    }
}
