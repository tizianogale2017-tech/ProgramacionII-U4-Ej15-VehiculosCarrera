package Ejercicio15_VehiculosCarrera;

public class Motocicleta extends VehiculoCarrera {
    private static final double ACELERACION = 15;
    private static final double VELOCIDAD_MAXIMA = 300;
    private static final double CONSUMO = 0.5;

    public Motocicleta(String nombre, double combustible) {
        super(nombre, combustible);
    }

    @Override
    public void acelerar(int segundos) {
        incrementarVelocidad(ACELERACION, VELOCIDAD_MAXIMA, segundos, CONSUMO);
    }

    @Override
    public String obtenerDesempeno() {
        return String.format("%s (Moto): %.0f km/h, combustible %.1f L (liviana, gasta poco)", getNombre(), getVelocidadActual(), getCombustible());
    }
}
