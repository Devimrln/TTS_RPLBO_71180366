package com.tts.vehicle;

public class MotorVehicle extends Vehicle{
    private String vehicleName;
    private Engine engine;
    private Tire tire;
    private Wheel wheel;
    private Transmision transmision;


    public MotorVehicle(Engine engine, Tire tire, Wheel wheel, Transmision transmision){
        this.setEngine(engine);
        this.setTire(tire);
        this.setTransmision(transmision);
        this.setWheel(wheel);
    }

    public MotorVehicle() {

    }


    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Transmision getTransmision() {
        return transmision;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }


}
