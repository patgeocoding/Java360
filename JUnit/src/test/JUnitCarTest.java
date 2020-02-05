package test;

import JUnit.JUnitCar;
import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitCarTest {

    public JUnitCarTest() {

    }

    String[] array = {"SXT", "GT", "R/T"};

    JUnitCar realCar = new JUnitCar("Dodge", "Charger", 2012, 4, false, true, array);
    JUnitCar nullCar = new JUnitCar();



    @Test
    public void testNull(){
        assertNull(nullCar.getMake());
    }

    @Test
    public void testNotEquals(){
        assertNotEquals("Dart", realCar.getModel());
    }

    @Test
    public void testEquals(){
        assertEquals(2012, realCar.getYear());
    }

    @Test
    public void testNotNull(){
        assertNotNull(realCar.getTires());
    }

    @Test
    public void testNotSame(){
        assertNotSame(5, realCar.getTires());
    }

    @Test
    public void testFalse(){
        assertFalse(realCar.getConvertible());
    }

    @Test
    public void testSame(){
        assertSame(true, realCar.getFWD());
    }

    @org.junit.jupiter.api.Test
    public void testArray(){
        assertArrayEquals(array, realCar.getArr());
    }
}
