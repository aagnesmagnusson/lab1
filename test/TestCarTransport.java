import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.*;

public class TestCarTransport {
    private CarTransport carTransport;
    private Car volvoCar;

    @BeforeEach
    public void setUp() {
        carTransport = new CarTransport(2, 5, Color.BLUE, "CarTransport1");
        volvoCar = new Volvo240(2, 4, Color.RED, "Car");
    }
//    @Test
//    public void testRampMovementAtStandstill() {
//        carTransport.setSpeed(0);
//        carTransport.lowerRamp();
//        assertTrue(carTransport.isRampLowered());
//
//        carTransport.raiseRamp();
//        assertFalse(carTransport.isRampLowered());
//    }
//
//    @Test(expected = IllegalStateException.class)
//    public void testRampMovementWhileMoving() {
//        carTransport.startEngine();
//        carTransport.increaseSpeed(10);
//        carTransport.lowerRamp();
//    }
//
//    @Test
//    public void testLoadCar() {
//        carTransport.setSpeed(0);
//        carTransport.lowerRamp();
//        carTransport.loadCar(car);
//        assertTrue(carTransport.isCarLoaded(car));
//    }
//
//    @Test
//    public void testUnloadCar() {
//        // Förutsätter att en bil redan är lastad
//        carTransport.setSpeed(0);
//        carTransport.lowerRamp();
//        carTransport.unloadCar();
//        assertFalse(carTransport.isCarLoaded(car));
//    }

    // Ytterligare tester för att kontrollera kapacitetsbegränsningar, bilens position, etc.
}

