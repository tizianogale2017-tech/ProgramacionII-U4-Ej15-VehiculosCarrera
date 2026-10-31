package Ejercicio15_VehiculosCarrera;

public class AutoRally extends VehiculoCarrera {
    private static final double ACELERACION = 12;
    private static final double VELOCIDAD_MAXIMA = 220;
    private static final double CONSUMO = 0.9;

    public AutoRally(String nombre, double combustible) {
        super(nombre, combustible);
    }

    @Override
    public void acelerar(int segundos) {
        incrementarVelocidad(ACELERACION, VELOCIDAD_MAXIMA, segundos, CONSUMO);
    }

    @Override
    public String obtenerDesempeno() {
        return String.format("%s (Rally): %.0f km/h, combustible %.1f L (tracción 4x4 estable)", getNombre(), getVelocidadActual(), getCombustible());
    }
}
