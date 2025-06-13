package car_factory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       FabricacionVehiculo auto = new FabricacionCoche();
       auto.fabricarVehiculo();

       System.out.println("--------------------------------------------------");

       FabricacionVehiculo pickup = new FabricacionPickup();
       pickup.fabricarVehiculo();


    }
}