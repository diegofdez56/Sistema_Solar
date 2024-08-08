package dev.diego;

import dev.diego.enums.*;

public final class App {
    private App() {
    }
   public static void main(String[] args) {
        Planet earth = new Planet("Earth", 1, 5.972e24, 1.08321e12, 12742, 149, PlanetType.TERRESTRIAL, true, 1, 1);
        Planet jupiter = new Planet("Jupiter", 79, 1.898e27, 1.43128e15, 139820, 778, PlanetType.GASEOUS, true, 11.86, 0.41);

        earth.print();
        System.out.println("Density of " + earth.getName() + ": " + earth.calculateDensity() + " kg/km³");
        System.out.println("Is " + earth.getName() + " an exterior planet? " + earth.isExterior());
        System.out.println();

        jupiter.print();
        System.out.println("Density of " + jupiter.getName() + ": " + jupiter.calculateDensity() + " kg/km³");
        System.out.println("Is " + jupiter.getName() + " an exterior planet? " + jupiter.isExterior());
    }
}