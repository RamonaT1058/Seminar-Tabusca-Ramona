package teste;

import clase.Matematica;
import clase.NumitorIncorectExceptie;
import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MatematicaTestJUnit5 {

    @Test
    public void testRightSuma(){
        Matematica matematica = new Matematica();
        assertEquals(8, matematica.suma(2,6));
    }

    @Test
    public void testInverseSuma(){
        Matematica matematica = new Matematica();
        int suma = matematica.suma(6,2);
        assertEquals(6,suma-2, "A picat testul de inverse.");
    }

    @Test
    public void testSumaPerformance(){
        Matematica matematica = new Matematica();
        assertTimeout(Duration.ofMillis(10), () -> matematica.suma(2,5));
    }

    @Test
    public void testSumaBoundaryInf(){
        Matematica matematica = new Matematica();
        assertEquals(0, matematica.suma(0,0));
    }
//    @Test
//    public void testSumaBoundarySup(){
//        Matematica matematica = new Matematica();
//        assertEquals(0, matematica.suma(0,0));
//    }

    @Test
    public void testRaportExceptie(){
        Matematica matematica = new Matematica();
        assertThrows(NumitorIncorectExceptie.class, () ->matematica.raport(3,0));
    }

    @Test
    public void testRightRaport(){
        Matematica m = new Matematica();
        assertEquals(2.0,m.suma(6,3));
    }

    @Test
    public void testBoundaryRaportInf(){
        Matematica m = new Matematica();
        assertEquals(-3,m.raport(3,-1),0.01);
    }
    @Test
    public void testBoundaryRaportSup(){
        Matematica m = new Matematica();
        assertEquals(7,m.raport(7,1),0.01);
    }

    @Test
    public void testCrossCheckRaport(){
        Matematica m = new Matematica();
        int contor=0;
        int numarator=6;
        int numitor=2;
//        int copie=numarator;
        while(numarator>0){
            numarator=numarator-numitor;
            contor++;
        }
        assertEquals(contor, m.raport(6,2));

    }

    @Test
    public void testPerformanceRaport(){
        Matematica m = new Matematica();
        assertTimeout(Duration.ofMillis(100), new Executable() {
            @Override
            public void execute() throws Throwable {
                m.raport(10,1);
            }
        });
    }

    @Test
    public void testRightEstePar(){
        Matematica m = new Matematica();
        assertFalse(m.estePar(25));
        assertTrue(m.estePar(20));
    }

    @Test
    public void testComformanceNNumerePare(){
        List<Integer> listaNumere;
        Matematica matematica = new Matematica();
        listaNumere=matematica.nNumerePare(3);
        assertEquals(3,listaNumere.size());

    }


}