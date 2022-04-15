package main;

import fabrica.FabricaAutobuz;
import fabrica.FabricaTramvai;
import fabrica.FabricaTroleibuz;
import mijlocTransport.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz = new FabricaAutobuz().returneazaMijlocTransport("B 94 CGT");
        MijlocTransport tramvai = new FabricaTramvai().returneazaMijlocTransport("B 13 RAM");
        MijlocTransport troleibuz = new FabricaTroleibuz().returneazaMijlocTransport("B 96 RZV");

        autobuz.afisareNrInmatriculare();
        tramvai.afisareNrInmatriculare();
        troleibuz.afisareNrInmatriculare();
    }
}
