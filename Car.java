import java.awt.*;

public abstract class Car implements Movable {
    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    public String modelName; // The car model name
    protected double xPos; // x-position of the car
    protected double yPos; // y-position of the car
    protected double direction; // direction of the car in radians

    public Car(int nrDoors, double enginePower, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.xPos = 0;
        this.yPos = 0;
        this.direction = Math.PI/2;
        stopEngine();
    }


    public int getNrDoors(){
        return nrDoors;
    }


    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    protected void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }

    protected abstract double speedFactor();

    public double getXPos() {
        return xPos;
    }

    public double getYPos() {
        return yPos;
    }

    public double getDirection() {
        return direction;
    }

    protected void setXPos(double x) {
        xPos = x;
    }

    protected void setYPos(double y) {
        yPos = y;
    }

    public void setDirection(double dir) {
        direction = (dir % (2*Math.PI) + 2*Math.PI)%(2*Math.PI);
    }

    public void move() {
        xPos += currentSpeed * Math.cos(direction);
        yPos += currentSpeed * Math.sin(direction);
    }

    public void turnLeft() {
        direction = (direction + Math.PI /2) % (2*Math.PI);
    }

    public void turnRight() {
        direction = (direction - Math.PI/2 + 2*Math.PI) % (2*Math.PI);
    }

    protected abstract void incrementSpeed(double amount);

    protected abstract void decrementSpeed(double amount);

    public void gas(double amount){
        incrementSpeed(amount);
    }

    public void brake(double amount){
        decrementSpeed(amount);
    }
}
