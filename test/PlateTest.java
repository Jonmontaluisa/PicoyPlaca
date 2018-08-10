import static org.junit.Assert.*;
import org.junit.Test;


public class PlateTest {
    Plate plate = new Plate("ABC4444");
    Plate plate1 = new Plate("ABC745");
    Plate plate2 = new Plate("ACD349");
    Plate plate3 = new Plate("AC4446");
    Plate plate4 = new Plate("ABE41");
    Plate plate5 = new Plate("ABC3444");
    Plate plate6 = new Plate("ADC7455");
    Plate plate7 = new Plate("ACD3469");
    Plate plate8 = new Plate("ACD4446");
    Plate plate9 = new Plate("ABE4661");
    @Test
    public void testVerifyPlate(){
        assertTrue(plate.verifyPlate());
        assertFalse(plate1.verifyPlate());
        assertFalse(plate2.verifyPlate());
        assertFalse(plate3.verifyPlate());
        assertFalse(plate4.verifyPlate());
    }
    @Test
    public void testLastDigit(){
        assertEquals(4,plate5.lastDigit());
        assertEquals(5,plate6.lastDigit());
        assertEquals(9,plate7.lastDigit());
        assertEquals(6,plate8.lastDigit());
        assertEquals(1,plate9.lastDigit());
    }
}
