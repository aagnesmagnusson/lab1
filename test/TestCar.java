import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.awt.*;

public class TestCar{
    private Car testCar;

    @BeforeEach
    public void init(){
        testCar = new Volvo240(4, 2, Color.BLUE,"testVolvo" );
    }

    @Test
    public void testStartEngine(){
        testCar.startEngine();
        assertEquals(testCar.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testStopEngine() {
        testCar.startEngine();
        testCar.stopEngine();
        assertEquals(testCar.getCurrentSpeed(), 0.0);
    }

    @Test
    public void testMove() {
        testCar.startEngine();
        testCar.move();
        assertEquals(testCar.getXPos() + testCar.getYPos() , 0 + 0.1);
    }

    @Test
    public void testTurnLeft() {
        double firstDirection = testCar.getDirection();
        testCar.turnLeft();
        assertEquals(testCar.getDirection(),firstDirection+(Math.PI/2) );
    }

    @Test
    public void testTurnRight() {
        double firstDirection = testCar.getDirection();
        testCar.turnRight();
        assertEquals(testCar.getDirection(),firstDirection-(Math.PI/2) );
    }

    @Test
    public void testGetNrDoors() {
        assertEquals(testCar.getNrDoors(), 4);
    }


    @Test
    public void testgetEnginePower() {
        assertEquals(testCar.getEnginePower(), 2);
    }

    @Test
    public void testgetCurrentSpeed() {
        testCar.startEngine();
        assertEquals(testCar.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testgetColor() {
        assertEquals(testCar.getColor(), Color.BLUE);
    }

    @Test
    public void testgetXpos() {
        assertEquals(testCar.getXPos(), 0);
    }

    @Test
    public void testgetYPos() {
        assertEquals(testCar.getYPos(), 0);
    }

    @Test
    public void testgetDirection() {
        assertEquals(testCar.getDirection(), Math.PI/2);
    }

    @Test
    public void testsetDirection() {
        testCar.setDirection(Math.PI);
        assertEquals(testCar.getDirection(), Math.PI);
    }

    @Test
    public void testsetXpos() {
        testCar.setXPos(0);
        assertEquals(testCar.getXPos(), 0);
    }
    @Test
    public void testsetYpos() {
        testCar.setYPos(0);
        assertEquals(testCar.getYPos(), 0);
    }

    @Test
    public void testsetColor() {
        testCar.setColor(Color.BLUE);
        assertEquals(testCar.getColor(), Color.BLUE);
    }

    @Test
    public void testCurrentSpeedWithinBounds() {
        testCar.startEngine();
        assertTrue(testCar.getCurrentSpeed() >= 0 && testCar.getCurrentSpeed() <= testCar.getEnginePower());
    }

    @Test
    public void testGasWithinBounds() {
        testCar.startEngine();
        assertThrows(IllegalArgumentException.class, () -> testCar.brake(1.5));
    }
    @Test
    public void testBrakelowerSpeed() {
        testCar.startEngine();
        testCar.gas(1);
        double firstSpeed = testCar.getCurrentSpeed();
        testCar.brake(0.5);
        assertTrue(firstSpeed > testCar.getCurrentSpeed());
    }
    @Test
    public void testGasincrementSpeed() {
        testCar.startEngine();
        double firstSpeed = testCar.getCurrentSpeed();
        testCar.gas(0.5);
        assertTrue(firstSpeed < testCar.getCurrentSpeed());
    }
    }
