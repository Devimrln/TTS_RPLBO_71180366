package com.tts.vehicle;

public class Transmision {
    private  String transType;
    private int numSpeed;

    public Transmision(String transType, int numSpeed) {
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public int getNumSpeed() {
        return numSpeed;
    }

    public void setNumSpeed(int numSpeed) {
        this.numSpeed = numSpeed;
    }
}
