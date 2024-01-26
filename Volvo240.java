import java.awt.*;

public class Volvo240 extends Car{

    private final static double trimFactor = 1.25; //klassattribut - delas av alla objekt i klassen

    public Volvo240(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }

    protected double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    protected void incrementSpeed(double amount){
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower());
    }

    protected void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

}
