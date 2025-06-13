package car_factory;

public class FabricacionCoche extends FabricacionVehiculo {

    @Override
    protected void recepcionYClasificacion() {
        System.out.println("Coche: Recepción y clasificación de piezas estándares.");
    }

    @Override
    protected void corteDePiezas() {
        System.out.println("Coche: Corte de piezas metálicas.");
    }

    @Override
    protected void ensambladoChasisCarroceria() {
        System.out.println("Coche: Ensamblado de chasis y carrocería.");
    }

    @Override
    protected void pintura() {
        System.out.println("Coche: Pintura con acabado brillante.");
    }

    @Override
    protected void ensamblePartesMecanicas() {
        System.out.println("Coche: Ensamble de motor y transmisión.");
    }

    @Override
    protected void terminacionExteriores() {
        System.out.println("Coche: Instalación de faros y molduras.");
    }

    @Override
    protected void acabadosInteriores() {
        System.out.println("Coche: Colocación de tapicería y tablero.");
    }

    @Override
    protected void verificacion() {
        System.out.println("Coche: Pruebas de calidad y seguridad.");
    }

}
