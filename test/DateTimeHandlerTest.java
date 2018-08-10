import static org.junit.Assert.*;
import org.junit.Test;

public class DateTimeHandlerTest {
    DateTimeHandler dth1 = new DateTimeHandler("monday","1316");
    DateTimeHandler dth2 = new DateTimeHandler("tuesday","3456");
    DateTimeHandler dth3 = new DateTimeHandler("friday","0106");
    DateTimeHandler dth4 = new DateTimeHandler("saturday","2306");
    DateTimeHandler dth5 = new DateTimeHandler("tuesday","5406");
    DateTimeHandler dth6 = new DateTimeHandler("monday","1398");

    @Test
    public void testVerifyTime(){
        assertTrue(dth1.verifyTime());
        assertFalse(dth2.verifyTime());
        assertTrue(dth3.verifyTime());
        assertTrue(dth4.verifyTime());
        assertFalse(dth5.verifyTime());
        assertFalse(dth6.verifyTime());

    }
}
