public class ScaniaBed extends Bed{

    public int angle;

    public void raise(int angle){
        if (angle > 0 && angle <70) //och kolla att vinkel är större än
            this.angle = angle;
        else {
            throw new IllegalArgumentException("Argument must be between 0 and 70");
        }
    }

    public void lower(int angle) {
        if (angle > 0 && angle < 70)
            this.angle = angle;
        else {
            throw new IllegalArgumentException("Argument must be between 0 and 70");
        }

        public int getAngle() {
            return this.angle;
        }
        ;

    }