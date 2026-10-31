package Ejercicio15_VehiculosCarrera;

public abstract class VehiculoCarrera {
    private final String nombre;
    private double velocidadActual;
    private double combustible;

    protected VehiculoCarrera(String nombre, double combustible) {
        if (nombre == null || nombre.isBlank() || combustible < 0) {
            throw new IllegalArgumentException("Vehículo inválido");
        }
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public abstract void acelerar(int segundos);

    public abstract String obtenerDesempeno();

    protected void incrementarVelocidad(double aceleracion, double velocidadMaxima, int segundos, double consumoPorSegundo) {
        for (int s = 0; s < segundos && combustible >= consumoPorSegundo; s++) {
            velocidadActual = Math.min(velocidadActual + aceleracion, velocidadMaxima);
            combustible -= consumoPorSegundo;
        }
    }

    public String getNombre() { return nombre; }
    public double getVelocidadActual() { return velocidadActual; }
    public double getCombustible() { return combustible; }
}
