import java.awt.*;

public class CarTransportBed{

    public boolean isRaised;

    public void raise() {
        this.isRaised = true;
    }

    public void lower() {
        this.isRaised = false;
    }

    public boolean getIsRaised(){return this.isRaised;}

}
