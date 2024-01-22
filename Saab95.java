import java.awt.*;

public class Saab95{

    // Allt nedan kan vara private
    public boolean turboOn;

    // Nedan metod är konstruktorn, brukar vara public för att kunna skapa objekt av klassen
    public Saab95(int nrDoors, double enginePower, Color color, String modelName, boolean turboOn) {
        super(nrDoors, enginePower, color, modelName);
        this.turboOn = turboOn;
    }


    // Nedan fyra kan vara public, getter metoder med info som användaren kan vilja ha
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

    // Ska användaren kunna ändra färgen på bilen?
    public void setColor(Color clr){
        color = clr;
    }

    // Nedan fyra kan vara public, används direkt av användaren
    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }

    public void setTurboOn(){
        turboOn = true;
    }

    public void setTurboOff(){
        turboOn = false;
    }

    // Nedan metod kan vara private, hjälpmetod som ej behöver vara synlig för användaren
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    // Dessa två kan vara private eftersom de används av gas och brake
    public void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    public void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }


    // Nedan två kan va public, används direkt
    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
}
