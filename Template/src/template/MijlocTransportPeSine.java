package template;

public abstract class MijlocTransportPeSine {
    abstract void opresteStatie1();
    abstract void opresteStatie2();
    abstract void opresteStatie3();

    public final void parcurgeSensNormal(){
        opresteStatie1();
        opresteStatie2();
        opresteStatie3();
    }

    public final void parcurgeSensInvers(){
        opresteStatie3();
        opresteStatie2();
        opresteStatie1();
    }
}
