package principal;

import zoo.Girafa;
import zoo.Ingrijitor;
import zoo.Zebra;
import zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        Ingrijitor ingrijitor=new Ingrijitor("Marc Johnson");
        Zoo zoo=new Zoo("Gradina zoologica din Berlin",ingrijitor);

        zoo.addAnimal(new Girafa("Marty"));
        zoo.addAnimal(new Girafa("Luca"));
        zoo.addAnimal(new Zebra("Bob"));

        zoo.hranesteAnimale();
    }
}
