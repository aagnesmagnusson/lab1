import java.awt.*;
import java.util.Stack;

public class CarTransport extends Truck implements Loadable<Car> {
    private final CarTransportBed transportbed = new CarTransportBed();
    private final Stack<Car> storage = new Stack<>();
    public CarTransport(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }


    @Override
    public void move(){
        if (transportbed.getIsRaised()){
            super.move();
            if (!storage.isEmpty()){
                for (Car car : storage) {
                    car.setXPos(this.getXPos());
                    car.setYPos(this.getYPos());}}
        else {
            throw new IllegalCallerException("Can't move when ramp is down");}

    }}

    public void load(Car car){
        double d = Math.sqrt(Math.pow(this.getXPos()-car.getXPos(),2) + Math.pow(this.getYPos()-car.getYPos(),2));
        if (transportbed.getIsRaised() && d <= 1)
            throw new IllegalCallerException("Can't load when ramp is raised");
        else
            storage.push(car);
    }

    public Car unload() {
        Car outCar = null;
        if (!storage.isEmpty() && !transportbed.getIsRaised()) {
            outCar = storage.pop();
            double xOffset = -1 * Math.cos(this.getDirection());
            double yOffset = -1 * Math.sin(this.getDirection());
            outCar.setXPos(this.getXPos() + xOffset);
            outCar.setYPos(this.getYPos() + yOffset);
        }
        return outCar;
    }

    @Override
    public void gas(double amount){
        if (!transportbed.getIsRaised())
            throw new IllegalStateException("Can't gas when ramp is down.");
        else
            super.gas(amount);
    };

    protected boolean getBedIsRaised() {
        return transportbed.getIsRaised();
    }

    protected Stack<Car> getStorage() {
        return storage;
    }

    @Override
    protected void raiseBed() {
        transportbed.raise();
    }

    @Override
    protected void lowerBed() {
        transportbed.lower();
    }
}
