import java.awt.*;

public class Scania extends Truck{
    private final Bed bed = new Bed();  // Composition
    public int angle;

    public Scania(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }

    public void setAngle(int angle){
        this.angle = angle;
        if (this.angle > 0)
            bed.raised = true;
        else
            bed.raised = false;
    };

    public int getAngle(){return this.angle;};


    public void setRaised(boolean raised, int angle){
        this.raised = raised;
        this.angle = angle;}

}
