import java.awt.*;

public class CarTransportBed{

    private boolean isRaised;

    protected void raise() {
        this.isRaised = true;
    }

    protected void lower() {
        this.isRaised = false;
    }

    protected boolean getIsRaised(){return this.isRaised;}
}
