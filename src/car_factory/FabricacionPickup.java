package car_factory;

public class FabricacionPickup extends FabricacionVehiculo {
    @Override
    protected void recepcionYClasificacion() {
        System.out.println("Pick-up: Recepción y clasificación de piezas.");
    }

    @Override
    protected void corteDePiezas() {
        System.out.println("Pick-up: Corte de chapas.");
    }

    @Override
    protected void ensambladoChasisCarroceria() {
        System.out.println("Pick-up: Ensamblado de chasis y carrocería.");
    }

    @Override
    protected void pintura() {
        System.out.println("Pick-up: Aplicando Pintura");
    }

    @Override
    protected void ensamblePartesMecanicas() {
        System.out.println("Pick-up: Ensamble de motor");
    }

    @Override
    protected void terminacionExteriores() {
        System.out.println("Pick-up: Montaje de defensa y parrilla.");
    }

    @Override
    protected void acabadosInteriores() {
        System.out.println("Pick-up: Tapicería y volante.");
    }

    @Override
    protected void verificacion() {
        System.out.println("Pick-up: Inspección todoterreno.");
    }

}
