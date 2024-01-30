import java.awt.*;

public class CarTransport extends Truck implements Loadable {
    private Bed bed = new CarTransportBed();  // Composition

    private final CarStorage storage = new CarStorage();  // Composition

    public CarTransport(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }

}

//hej