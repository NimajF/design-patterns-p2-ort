package car_factory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehiculo fordK = new Vehiculo(Marca.FORD, ModeloAuto.KA, 22000, "Ford Ka 3 puertas");
        FabricacionVehiculo fa = new FabricacionCoche(fordK);
        fa.fabricarVehiculo();

        System.out.println("--------------------------------------------------");

        Vehiculo fordRanger = new Vehiculo(Marca.FORD, ModeloPickup.RANGER, 35000, "Ford Ranger 4x4");
        FabricacionVehiculo fp = new FabricacionPickup(fordRanger);
        fp.fabricarVehiculo();
    }
}