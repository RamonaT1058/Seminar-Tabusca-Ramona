package main;

import memento.Autobuz;
import memento.ManagerAutobaza;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Andrei", 3, 2019, "A1", 30);
        ManagerAutobaza manager = new ManagerAutobaza();
        manager.add(autobuz.save());
        autobuz.setNumeSofer("Mihai");
        manager.add(autobuz.save());
        autobuz.setConsum(7);
        manager.add(autobuz.save());
        System.out.println(autobuz.toString());
        autobuz.undo(manager.getMemento(0));
        System.out.println(autobuz.toString());
    }
}
