package com.company;

public class Main {

    public static void main(String[] args) {
        Roadster roadster = new Roadster("Roadster", 220);
        roadster.OutPut();
        Tesla tesla = new Tesla("Tesla", 120);
        tesla.OutPut();
        Roadster roadster1 = new Roadster("RoadsterA", 550);
        Tesla tesla1 = new Tesla("Tesla", 120);

        System.out.println(tesla.toString());
        System.out.println(roadster.toString());

        System.out.println(roadster.equals(roadster1));
        System.out.println(tesla.equals(tesla1));

        System.out.println(tesla.hashCode());
        System.out.println(tesla1.hashCode());

        System.out.println(roadster.hashCode());
        System.out.println(roadster1.hashCode());
    }

}
