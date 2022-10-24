package com.tts.vehicle;

public class Tire {
    private String tireType;
    private int width;
    private int aspectRation;
    private int wheelDiameter;

    public Tire(String trail, int i, int i1, int i2) {
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getAspectRation() {
        return aspectRation;
    }

    public void setAspectRation(int aspectRation) {
        this.aspectRation = aspectRation;
    }

    public int getWheelDiameter() {
        return wheelDiameter;
    }

    public void setWheelDiameter(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }
}
