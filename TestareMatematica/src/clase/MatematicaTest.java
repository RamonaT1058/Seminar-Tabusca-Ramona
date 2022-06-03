package clase;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatematicaTest {
    @Test
    public void test(){
        int suma;
        Matematica m = new Matematica();
        suma=m.suma(3, 5);
        assertEquals(8, suma);
    }

    @Test
    public void raportRight(){
        double rezultat;
        Matematica m = new Matematica();
        rezultat=m.raport(6,3);
        assertEquals(2.0,rezultat,0.01);
    }

    @Test
    public void raportBoundaryInf(){
        Matematica m = new Matematica();
        assertEquals(0.0,m.raport(0,1),0.01);
    }

    @Test
    public void raportBoundarySup(){
        Matematica m = new Matematica();
        assertEquals(0.0,m.raport(0,1),0.01);
    }

    @Test
    public void raportCardinality1(){
        Matematica m = new Matematica();
        assertEquals(1.0,m.raport(1,1),0.01);
    }

    @Test
    public void raportInverse(){
        Matematica m = new Matematica();
        double raport, inmultire;
        raport=m.raport(6,2);
        inmultire=raport*2;
        assertEquals(6.0, inmultire,0.01);
    }

    @Test(expected = ArithmeticException.class)
    public void raportError(){
        Matematica m = new Matematica();
        m.raport(3,0);
    }

    @Test(timeout = 1)
    public void raportPerformane(){
        Matematica m = new Matematica();
        m.raport(3,3);
    }

    @Test
    public void esteParRight(){
        Matematica m = new Matematica();
        assertTrue(m.estePar(20));
    }


}