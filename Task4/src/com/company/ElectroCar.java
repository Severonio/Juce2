package com.company;

public class ElectroCar extends Mashine {

    @Override
    public void getInformation() {
        super.getInformation();
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public int getSeats() {
        return 0;
    }

    @Override
    public int getWheels() {
        return 0;
    }

    @Override
    public boolean WheelsOn() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+ "Electrocar{" +
                "MAX_SPEED=" + MAX_SPEED +
                '}';
    }


}

