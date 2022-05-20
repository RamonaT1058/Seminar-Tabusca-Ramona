package teste;

import clase.Persoana;
import exceptii.CNPInvalidException;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetSexTest {

    @Test
    public void getSexRight(){
        Persoana pF=new Persoana("Iulia", "6000807234890");
        assertEquals("F", pF.getSex());
        Persoana pM=new Persoana("Andrei", "5990705224123");
        assertEquals("M", pM.getSex());
    }

    @Test
    public void getSexBoundaryF(){
        Persoana pF=new Persoana("Iulia", "6000807234890");
        assertEquals("F", pF.getSex());
    }

    @Test
    public void getSexBoundaryM(){
        Persoana pM=new Persoana("Andrei", "1990705224123");
        assertEquals("M", pM.getSex());
    }

    @Test
    public void getSexCrossCheck(){
        Persoana pM = new Persoana("George", "5000226435678");
        int primaCifra=pM.CNP.charAt(0);
        assertEquals(primaCifra%2==0?"F":"M", pM.getSex());
    }

    @Test
    public void testGetSexShouldThrowException(){
        Persoana persoana = new Persoana("Andrei","000123412345");
        try{
            persoana.getSex();
            fail("Metoda nu arunca exceptie.");
        } catch (CNPInvalidException exceptie){

        }
    }

    @Test(expected = CNPInvalidException.class)
    public void testGetSexShouldThrowExceptionJunit4(){
        Persoana p = new Persoana("Andrei", "098901237212");
        p.getSex();

    }

    @Test(expected = NullPointerException.class)
    public void testGetSexShouldThrowExceptionNull(){
        Persoana p = new Persoana("Andrei", null);
        p.getSex();

    }

    @Test(timeout = 100)
    public void testGetSexPerformance() {
        Persoana p = new Persoana("Andrei", "5890321098432");
        p.getSex();
    }

    @Test
    public void testGetSexComformance(){
        Persoana p = new Persoana("Andrei", "5890321098432");
        assertEquals(1, p.getSex().length());
    }

    @Test
    public void testGetSexRange(){
        Persoana p = new Persoana("Andrei", "7890321098432");
        assertEquals("N/A", p.getSex());
    }





}