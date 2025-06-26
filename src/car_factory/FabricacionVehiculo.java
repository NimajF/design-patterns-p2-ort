package car_factory;

public abstract class FabricacionVehiculo {
    private final Vehiculo vehiculo;
    private Etapa etapa = Etapa.RECEPCION_Y_CLASIFICACION;

    public FabricacionVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public final void fabricarVehiculo() {
        while (etapa != Etapa.ENTREGA) {
           ejecutarEtapa(etapa);
           etapa = siguienteEtapa(etapa);
        }
        entrega();
    }

    private void ejecutarEtapa(Etapa etapa) {
        switch (etapa) {
            case RECEPCION_Y_CLASIFICACION:
                this.recepcionYClasificacion();
                break;

            case CORTE_PIEZAS:
                this.corteDePiezas();
                break;

            case ENSAMBLADO_CHASIS_CARROCERIA:
                this.ensambladoChasisCarroceria();
                break;

            case PINTURA:
                this.pintura();
                break;

            case ENSAMBLE_PARTES_MECANICAS:
                this.ensamblePartesMecanicas();
                break;

            case TERMINACION_EXTERIORES:
                this.terminacionExteriores();
                break;

            case ACABADOS_INTERIORES:
                this.acabadosInteriores();
                break;

            case VERIFICACION:
                this.verificacion();
                break;

            default:
                break;
        }
    }

    private Etapa siguienteEtapa(Etapa etapa) {
        Etapa etapaActual;
        Etapa[] etapas = Etapa.values();
        int pos = etapa.ordinal();
        if (pos + 1 < etapas.length) {
            etapaActual = etapas[pos + 1];
        } else {
            etapaActual = Etapa.ENTREGA;
        }
        return etapaActual;
    }

    protected Vehiculo getVehiculo() {
        return vehiculo;
    }

    protected abstract void recepcionYClasificacion();

    protected abstract void corteDePiezas();

    protected abstract void ensambladoChasisCarroceria();

    protected abstract void pintura();

    protected abstract void ensamblePartesMecanicas();

    protected abstract void terminacionExteriores();

    protected abstract void acabadosInteriores();

    protected abstract void verificacion();

    protected void entrega() {
        System.out.println("Vehiculo " + getClass().getSimpleName() + " listo para entrega.");
    }
}
