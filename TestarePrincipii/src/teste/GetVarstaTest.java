package teste;

import clase.Persoana;
import exceptii.CNPInvalidException;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetVarstaTest {
    @Test
    public void getVarstaRight(){
        Persoana p = new Persoana("Maria", "6000823678967");
        assertEquals(21, p.getVarsta());
    }

    @Test
    public void getVarstaBoundaryInf(){
        Persoana p = new Persoana("Maria", "3000101678967");
        assertEquals(222, p.getVarsta());
    }

    @Test
    public void getVarstaBoundarySup(){
        Persoana p = new Persoana("Maria", "6220101678967");
        assertEquals(0, p.getVarsta());
    }

    @Test(expected = NullPointerException.class)
    public void getVarstaErrorNull(){
        Persoana p = new Persoana("Maria", null);
        p.getVarsta();
    }

    @Test(expected = CNPInvalidException.class)
    public void getVarstaErrorCNPInvalid(){
        Persoana p = new Persoana("Maria", "6250101678967");
        p.getVarsta();
    }

    @Test(timeout = 100)
    public void getVarstaPerformance() {
        Persoana p = new Persoana("Maria", "6200101678967");
        p.getVarsta();
    }

    @Test
    public void getVarstaOrdering(){
        Persoana p1 = new Persoana("Maria", "6000101678967");
        Persoana p2 = new Persoana("Mihaela", "62010101678967");
        assertTrue(p1.getVarsta()>p2.getVarsta());
    }

    @Test
    public void getVarstaCardinality1(){
        Persoana p = new Persoana("Maria", "6210101678967");
        assertEquals(1, p.getVarsta());
    }

}