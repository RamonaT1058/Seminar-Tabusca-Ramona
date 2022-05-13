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
}