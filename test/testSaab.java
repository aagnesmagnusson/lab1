import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}
