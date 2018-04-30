package Lab3;


public class Car {
    private Machine[] machines;

    public Car(Machine[] list){
        machines = list;
    }

    public void printList(){
        for(Machine machine : machines){
            System.out.println(machine);
        }
    }

    public void printList(boolean onParking) { // not working
        for (Machine machine: machines) {
            if (machine.isOnParking() == onParking )
                System.out.println("Not on the parking - " + machine);
        }
    }

    public String findByPlate(String licPlate){
        String result = "";
        for(Machine machine: machines){
            if(machine.getLicPlate().contains(licPlate)){
                result += machine.toString();
            }
        }return result.isEmpty()?"Nothing here": result;
    }


}
