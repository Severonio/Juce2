package Lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car car;
        Machine[] machines = {new Machine("Shkoda", "AI3333", "Miki", "Gavela", 613 ),
                new Machine("Audi", "AB0000", "Zago", "Shepeleva", 300, false)
        /*,new Machine()*/};
        car = new Car(machines);
        System.out.println("Cars: ");
        car.printList();
        System.out.println("Search by license number: ");
        String licplate = input.nextLine();
        String plated = car.findByPlate(licplate);
        System.out.println(plated);

    }
}
