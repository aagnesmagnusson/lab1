import java.awt.*;

public abstract class Truck extends Vehicle implements HasBed {


    public Truck(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }

    protected double speedFactor() {
        return getEnginePower() * 0.01;
    }

//    public boolean isRaised() {
//        return raised;
//    }
//
//    public void setRaised(boolean raised) {
//        this.raised = raised;
//    }

    public abstract void raise();

    public abstract void lower();


}



