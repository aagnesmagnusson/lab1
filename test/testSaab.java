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


    @Test
    public void testspeedFactor() {
        assertEquals(testSaab.speedFactor(), testSaab.enginePower*0.01*1.3);
    }

    @Test
    public void testincrementSpeed() {
        testSaab.startEngine();
        double expectedSpeed = testSaab.getCurrentSpeed() + testSaab.speedFactor() * 3;
        testSaab.incrementSpeed(3);
        assertEquals(testSaab.currentSpeed, expectedSpeed);
    }

    @Test
    public void testdecrementSpeed() {
        testSaab.startEngine();
        double expectedSpeed = testSaab.getCurrentSpeed() - testSaab.speedFactor() * 3;
        testSaab.decrementSpeed(3);
        assertEquals(testSaab.currentSpeed, expectedSpeed);
    }

    @Test
    public void testGas() {
        testSaab.startEngine();
        double expectedSpeed = testSaab.getCurrentSpeed() + testSaab.speedFactor() * 2;
        testSaab.gas(2);
        assertEquals(testSaab.currentSpeed, expectedSpeed);
    }

    @Test
    public void testBrake() {
        testSaab.startEngine();
        double expectedSpeed = testSaab.getCurrentSpeed() - testSaab.speedFactor() * 2;
        testSaab.brake(2);
        assertEquals(testSaab.currentSpeed, expectedSpeed);
    }
}
