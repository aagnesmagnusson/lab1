import java.awt.*;

public class Saab95 extends Car {

    // Allt nedan kan vara private
    protected boolean turboOn;

    // Nedan metod är konstruktorn, brukar vara public för att kunna skapa objekt av klassen
    public Saab95(int nrDoors, double enginePower, Color color, String modelName, boolean turboOn) {
        super(nrDoors, enginePower, color, modelName);
        this.turboOn = turboOn;
    }


    public void setTurboOn() {
        turboOn = true;
    }

    public void setTurboOff() {
        turboOn = false;
    }

    protected double speedFactor() {
        double turbo = 1;
        if (turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    // Dessa två kan vara private eftersom de används av gas och brake
    protected void incrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    protected void decrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }



}
