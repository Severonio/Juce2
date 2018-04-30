package com.company;

public class Roadster extends ElectroCar {
    private int cost = 12000;
    private String motorsName = "Motor 2000";
    public Roadster(String name, int speed){
        super.setName(name);
        super.setSpeed(speed);
    }
    @Override
    public void OutPut() {
        System.out.println(super.getName() + ", current speed = " + super.getSpeed());
        System.out.println("Price = " + cost +"$");
        System.out.println("Motor's name: " + motorsName);
        super.getInformation();
    }

}
