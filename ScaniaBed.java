public class ScaniaBed {

    public int angle;

    public ScaniaBed() {
        super();
        this.angle = 0;
    }


    public void raise() {
        if (this.angle <= 60)
            this.angle += 10;
        else {
            this.angle = 70;
        }
    }


    public void lower() {
        if (this.angle >= 10)
            this.angle -= 10;
        else {
            this.angle = 0;
        }
    }

    public int getAngle(){return this.angle;}

    public void setAngle(int angle){
        if (angle >= 0 && angle <= 70)
            this.angle = angle;
        else
            throw new IllegalArgumentException("Angle must be between 0 and 70");
    }
}