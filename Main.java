package Ejercicio15_VehiculosCarrera;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<VehiculoCarrera> vehiculos = new ArrayList<>();
        vehiculos.add(new MonoplazaF1("Flecha Roja", 40));
        vehiculos.add(new AutoRally("Dakar 4x4", 40));
        vehiculos.add(new Motocicleta("Rayo 1000", 15));

        DirectorCarrera director = new DirectorCarrera();
        director.correrPrueba(vehiculos, 10);
        director.correrPrueba(vehiculos, 15);
    }
}
