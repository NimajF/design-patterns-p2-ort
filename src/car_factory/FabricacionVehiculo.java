package car_factory;

public abstract class FabricacionVehiculo {
    private Etapa etapa;


    protected abstract void recepcionYClasificacion();
    protected abstract void corteDePiezas();
    protected abstract void ensambladoChasisCarroceria();
    protected abstract void pintura();
    protected abstract void ensamblePartesMecanicas();
    protected abstract void terminacionExteriores();
    protected abstract void acabadosInteriores();
    protected abstract void verificacion();
    protected abstract void entrega();
}
