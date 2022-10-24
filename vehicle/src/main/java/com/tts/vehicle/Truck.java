package com.tts.vehicle;

public class Truck extends MotorVehicle{
    private int capacity;

    public Truck(Engine engine, Transmision transmision, Tire tire, Wheel wheel, int capacity) {
        super(engine, tire, wheel, transmision);
        this.capacity = capacity;
    }

    public void backward(){

    }
    public void brake(){

    }
    public void forward(){

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void turnLeft(){

    }
    public void turnRight(){

    }

    public Transmision getTransmition() {
        return getTransmition();
    }

    public Tire getTire() {
        return getTire();
    }
}
