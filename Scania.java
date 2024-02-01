import java.awt.*;

public class Scania extends Truck{
    private final ScaniaBed scaniaBed = new ScaniaBed();

    public Scania(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }

    @Override
    public void move(){
        if (scaniaBed.angle == 0)
            super.move();
        else
            throw new IllegalCallerException("Can't move when bed is raised");
    }

    public int getBedAngle() {
        return scaniaBed.getAngle();
    }

    public void setBedAngle(int angle) {
        if (this.getCurrentSpeed() == 0)
            scaniaBed.setAngle(angle);

    }

    @Override
    public void gas(double amount){
        if (scaniaBed.angle > 0)
            throw new IllegalStateException("Can't gas when bed is raised.");
        else
            super.gas(amount);
    };

    @Override
    protected void raiseBed() {
        scaniaBed.raise();
    }


    @Override
    protected void lowerBed() {
        scaniaBed.lower();
    }
}

