package main;

import clase.Autobuz;
import clase.Comanda;
import clase.ComandaPlecareInCursa;
import clase.Operator;

public class Main {
    public static void main(String[] args) {
        Autobuz a = new Autobuz("B22AAA");
        Autobuz a2=new Autobuz("B23BBB");

        Operator operator = new Operator();
        Comanda comanda = new ComandaPlecareInCursa(a, 2);
        Comanda comanda2 = new ComandaPlecareInCursa(a2, 3);
        Comanda comanda3 = new ComandaPlecareInCursa(a, 3);
        Comanda comanda4 = new ComandaPlecareInCursa(a2, 4);

        operator.adaugaComanda(comanda);
        operator.adaugaComanda(comanda2);
        operator.adaugaComanda(comanda3);
        operator.adaugaComanda(comanda4);

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
