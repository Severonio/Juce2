package com.company;

import java.util.Objects;

public abstract class Mashine implements Run {
    public final int MAX_SPEED = 330;
    private final int MIN_SPEED = 1;
    private final  int MIN_SEATS = 1;
    private final int MAX_SEATS = 4;

    private String name;
    private int speed;

    public Mashine(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public Mashine(){}

    public void OutPut() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void getInformation() {
        System.out.println("Max speed: " + MAX_SPEED + "\n" + "Max seats: " + MAX_SEATS +
                "\nMin seats: " + MIN_SEATS + "\nMin speed: " + MIN_SPEED);
    }

    @Override
    public String toString() {
        return "Mashine{" +
                "MAX_SPEED=" + MAX_SPEED +
                ", MIN_SPEED=" + MIN_SPEED +
                ", MIN_SEATS=" + MIN_SEATS +
                ", MAX_SEATS=" + MAX_SEATS +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mashine mashine = (Mashine) o;
        return MAX_SPEED == mashine.MAX_SPEED &&
                MIN_SPEED == mashine.MIN_SPEED &&
                MIN_SEATS == mashine.MIN_SEATS &&
                MAX_SEATS == mashine.MAX_SEATS &&
                speed == mashine.speed &&
                Objects.equals(name, mashine.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(MAX_SPEED, MIN_SPEED, MIN_SEATS, MAX_SEATS, name, speed);
    }
}
