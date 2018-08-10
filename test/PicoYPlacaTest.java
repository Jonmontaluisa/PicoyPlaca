import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Calendar;

public class PicoYPlacaTest {
    Plate plate = new Plate("ABC4444");
    Plate plate1 = new Plate("ABC444");
    Plate plate2 = new Plate("AC34");
    Plate plate3 = new Plate("ABC44A");
    Plate plate4 = new Plate("AB4444");
    @Test
    public void testVerifyPlate(){
        assertTrue(plate.verifyPlate());
        assertFalse(plate1.verifyPlate());
        assertFalse(plate2.verifyPlate());
        assertFalse(plate3.verifyPlate());
        assertFalse(plate4.verifyPlate());
    }
}
