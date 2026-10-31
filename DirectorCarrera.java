package Ejercicio15_VehiculosCarrera;

import java.util.List;

public class DirectorCarrera {
    public void correrPrueba(List<VehiculoCarrera> vehiculos, int segundos) {
        System.out.println("--- Prueba de aceleración: " + segundos + " segundos ---");
        for (VehiculoCarrera v : vehiculos) {
            v.acelerar(segundos);
            System.out.println(v.obtenerDesempeno());
        }
    }
}
