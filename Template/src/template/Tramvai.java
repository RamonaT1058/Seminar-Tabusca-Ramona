package template;

public class Tramvai extends MijlocTransportPeSine{
    @Override
    void opresteStatie1() {
        System.out.println("Tramvaiul a oprit iin statia 1.");
    }

    @Override
    void opresteStatie2() {
        System.out.println("Tramvaiul a oprit iin statia 2.");
    }

    @Override
    void opresteStatie3() {
        System.out.println("Tramvaiul a oprit iin statia 3.");
    }
}
