import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.awt.*;

public class testCar{
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
        assertEquals(testCar.getNrDoors(), testCar.nrDoors);
    }


    @Test
    public void testgetEnginePower() {
        assertEquals(testCar.getEnginePower(), testCar.enginePower);
    }

    @Test
    public void testgetCurrentSpeed() {
        assertEquals(testCar.getCurrentSpeed(), testCar.currentSpeed);
    }

    @Test
    public void testgetColor() {
        assertEquals(testCar.getColor(), testCar.color);
    }

    @Test
    public void testgetXpos() {
        assertEquals(testCar.getXPos(), testCar.xPos);
    }

    @Test
    public void testgetYPos() {
        assertEquals(testCar.getYPos(), testCar.yPos);
    }

    @Test
    public void testgetDirection() {
        assertEquals(testCar.getDirection(), testCar.direction);
    }

    @Test
    public void testsetDirection() {
        testCar.setDirection(Math.PI);
        assertEquals(testCar.direction, Math.PI);
    }

    @Test
    public void testsetXpos() {
        testCar.setXPos(0);
        assertEquals(testCar.xPos, 0);
    }
    @Test
    public void testsetYpos() {
        testCar.setYPos(0);
        assertEquals(testCar.yPos, 0);
    }

    @Test
    public void testsetColor() {
        testCar.setColor(Color.BLUE);
        assertEquals(testCar.color, Color.BLUE);
    }

}
