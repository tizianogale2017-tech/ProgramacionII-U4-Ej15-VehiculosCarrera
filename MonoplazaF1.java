package Ejercicio15_VehiculosCarrera;

public class MonoplazaF1 extends VehiculoCarrera {
    private static final double ACELERACION = 18;
    private static final double VELOCIDAD_MAXIMA = 340;
    private static final double CONSUMO = 1.2;

    public MonoplazaF1(String nombre, double combustible) {
        super(nombre, combustible);
    }

    @Override
    public void acelerar(int segundos) {
        incrementarVelocidad(ACELERACION, VELOCIDAD_MAXIMA, segundos, CONSUMO);
    }

    @Override
    public String obtenerDesempeno() {
        return String.format("%s (F1): %.0f km/h, combustible %.1f L", getNombre(), getVelocidadActual(), getCombustible());
    }
}
