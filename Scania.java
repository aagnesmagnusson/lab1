import java.awt.*;

public class Scania extends Truck{
    private final ScaniaBed bed = new ScaniaBed();
    //public int angle;

    public Scania(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }

    @Override
    public void raise() {
        if (this.getCurrentSpeed() == 0)
            bed.raise();
        else
            throw new IllegalStateException("Can't raise bed while moving.");
    }

    @Override
    public void lower() {
        if (this.getCurrentSpeed() == 0)
            bed.lower();
        else
            throw new IllegalStateException("Can't lower bed while moving.");
    }
    @Override
    public void move(){
        if (bed.angle == 0)
            super.move();
        else
            throw new IllegalCallerException("Can't move when bed is raised");
    }

    public int getBedAngle() {
        return bed.getAngle();
    }

    public void setBedAngle(int angle) {
        if (this.getCurrentSpeed() == 0)
            bed.setAngle(angle);

    }

    @Override
    public void gas(double amount){
        if (bed.angle > 0)
            throw new IllegalStateException("Can't gas when bed is raised.");
        else
            super.gas(amount);
    };
}

//hej
