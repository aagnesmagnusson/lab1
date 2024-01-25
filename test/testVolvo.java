import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testVolvo {

    private Volvo240 testVolvo;

    @BeforeEach
    public void init() {
        testVolvo = new Volvo240(4, 2, Color.BLUE, "testSaab");
    }

    @Test
    public void testspeedFactor() {
        assertEquals(testVolvo.speedFactor(), testVolvo.enginePower * 0.01 * 1.25);
    }

    @Test
    public void testincrementSpeed() {
        testVolvo.startEngine();
        double expectedSpeed = Math.min(testVolvo.getCurrentSpeed() + testVolvo.speedFactor() * 3, testVolvo.enginePower);
        testVolvo.incrementSpeed(3);
        assertEquals(testVolvo.currentSpeed, expectedSpeed);
    }

    @Test
    public void testdecrementSpeed() {
        testVolvo.startEngine();
        double expectedSpeed = Math.max(testVolvo.getCurrentSpeed() - testVolvo.speedFactor() * 3, 0);
        testVolvo.decrementSpeed(3);
        assertEquals(testVolvo.currentSpeed, expectedSpeed);
    }

    @Test
    public void testGas() {
        testVolvo.startEngine();
        double expectedSpeed = Math.min(testVolvo.getCurrentSpeed() + testVolvo.speedFactor() * 2, testVolvo.enginePower);
        testVolvo.gas(2);
        assertEquals(testVolvo.currentSpeed, expectedSpeed);
    }

    @Test
    public void testBrake() {
        testVolvo.startEngine();
        double expectedSpeed = Math.max(testVolvo.getCurrentSpeed() - testVolvo.speedFactor() * 2, 0);
        testVolvo.brake(2);
        assertEquals(testVolvo.currentSpeed, expectedSpeed);
    }
}
