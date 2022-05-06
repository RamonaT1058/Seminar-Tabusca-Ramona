package memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobaza {
    List<MementoAutobuz> listaAutobuzeMemento;


    public ManagerAutobaza() {
        listaAutobuzeMemento = new ArrayList<>();
    }

    public ManagerAutobaza(List<MementoAutobuz> listaAutobuzeMemento) {
        this.listaAutobuzeMemento = listaAutobuzeMemento;
    }

    public void add(MementoAutobuz a){
        listaAutobuzeMemento.add(a);
    }

    public MementoAutobuz getMemento(int poz) {
        return listaAutobuzeMemento.get(poz);
    }
}
