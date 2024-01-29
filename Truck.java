import java.awt.*;

public class Truck extends Vehicle implements HasBed {

    private final Bed bed = new Bed();  // Composition
    public boolean raised;

    public Truck(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }

    protected double speedFactor() {
        return getEnginePower() * 0.01; // Kanske ändra sen
    }

    public void setRaised(boolean raised){this.raised = raised;}

    public boolean getRaised(){return this.raised;}
}