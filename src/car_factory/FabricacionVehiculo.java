package car_factory;

public abstract class FabricacionVehiculo {
    private Etapa etapa = Etapa.RECEPCION_Y_CLASIFICACION;

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

            case CORTE_PIEZAS:
                this.corteDePiezas();

            case ENSAMBLADO_CHASIS_CARROCERIA:
                this.ensambladoChasisCarroceria();

            case PINTURA:
                this.pintura();

            case ENSAMBLE_PARTES_MECANICAS:
                this.ensamblePartesMecanicas();

            case TERMINACION_EXTERIORES:
                this.terminacionExteriores();

            case ACABADOS_INTERIORES:
                this.acabadosInteriores();

            case VERIFICACION:
                this.verificacion();

            default:
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
