package com.curtis.adventofcode2019.day3;

public class LocationObject {

    public int yLocation;
    public int xLocation;
    public int steps;


    public LocationObject(int yLocation, int xLocation, int steps) {
        this.yLocation = yLocation;
        this.xLocation = xLocation;
        this.steps = steps;
    }


    public int getyLocation() {
        return yLocation;
    }

    public void setyLocation(int yLocation) {
        this.yLocation = yLocation;
    }

    public int getxLocation() {
        return xLocation;
    }

    public void setxLocation(int xLocation) {
        this.xLocation = xLocation;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public static LocationObject yAxisAdjustment (LocationObject object, int adjustment, int addSteps) {
        object.setyLocation(object.getyLocation() + adjustment);
        object.setSteps(object.getSteps() + addSteps);
        return object;
    }


    public static LocationObject xAxisAdjustment (LocationObject object, int adjustment, int addSteps) {
        object.setxLocation(object.getxLocation() + adjustment);
        object.setSteps(object.getSteps() + addSteps);
        return object;
    }

    @Override
    public boolean equals(Object obj) {
        LocationObject locObj = (LocationObject) obj;

        if (this.getxLocation() != locObj.getxLocation()) {
            return false;
        }

        if (this.getyLocation() != locObj.getyLocation()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String y = String.valueOf(yLocation);
        String x = String.valueOf(xLocation);
        String steps = String.valueOf(this.steps);

        return y + " " + x + " Steps = " + steps;

    }
}
