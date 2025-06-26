package car_factory;

public class Vehiculo {
    private final Marca marca;
    private final Enum<?> modelo;
    private final double precioBase;
    private final String descripcion;

    public Vehiculo(Marca marca, Enum<?> modelo, double precioBase, String descripcion) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.descripcion = descripcion;
    }

    public Marca getMarca() { return marca; }
    public String getModelo() { return ((Enum<?>) modelo).name(); }
    public double getPrecioBase() { return precioBase; }
    public String getDescripcion() { return descripcion; }

    public double calcularPrecioTotal() {
        // aquí podrías agregar lógicas según modelo, etc.
        return precioBase;
    }

    public String detalleCompleto() {
        return marca + " " + modelo + " — " + descripcion;
    }
}
