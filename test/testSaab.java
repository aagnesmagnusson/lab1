import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class testSaab {
    private Saab95 testSaab;

    @BeforeEach
    public void init() {

        testSaab = new Saab95(4, 2, Color.BLUE, "testSaab", true);
    }

    @Test
    public void testTurboOn() {
        testSaab.setTurboOn();
        assertTrue(testSaab.turboOn);
    }


    @Test
    public void testTurboOff() {
        testSaab.setTurboOff();
        assertFalse(testSaab.turboOn);
    }


    //@Test
    //public void testspeedFactor() {
    //    testSaab.setTurboOn();
    //    assertEquals(testSaab.enginePower);

    //}

}
