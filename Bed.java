public class Bed implements HasBed {
    // Ska kunna höjas och sänkas --> vinkel

    //public int angle;
    public boolean raised;

    public void raise(boolean raised){this.raised = true;};
    public void lower(boolean raised){this.raised = false;}

    public boolean getRaised(){return this.raised;};


}

//hej