import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.awt.*;

public class testCar {
    private Car testCar;

    @BeforeEach
    public void init(){
        testCar = new Volvo240(4, 2, Color.BLUE,"testVolvo" );
    }

    @Test
    public void testStartEngine(){
        testCar.startEngine();
        assertEquals(testCar.currentSpeed, 0.1);
    }

    @Test
    public void testStopEngine() {
        testCar.startEngine();
        testCar.stopEngine();
        assertEquals(testCar.currentSpeed, 0.0);
    }

    @Test
    public void testMove() {

        testCar.move();
        assertEquals(testCar.getXPos(), 0);
        assertEquals(testCar.getYPos(), 0.1);
    }

    @Test
    void testTurnLeft() {
        testCar.turnLeft();
        assertEquals(testCar.getDirection(), Math.PI);
    }

    @Test
    void testTurnRight() {
        double firstDirection = testCar.getDirection();
        testCar.turnRight();
        assertEquals(testCar.getDirection(),firstDirection-(Math.PI/2) );
    }
}
