package dev.diego;

import dev.diego.enums.*;

public class Planet {

    private String name;
    private int numSatellites;
    private double mass;
    private double volume;
    private int diameter;
    private int distanceToSun;
    private PlanetType type;
    private boolean isVisible;
    private double orbitalPeriod;
    private double rotationPeriod;


    public Planet(String name, int numSatellites, double mass, double volume, int diameter, int distanceToSun, PlanetType type, boolean isVisible, double orbitalPeriod, double rotationPeriod) {
        this.name = name;
        this.numSatellites = numSatellites;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.distanceToSun = distanceToSun;
        this.type = type;
        this.isVisible = isVisible;
        this.orbitalPeriod = orbitalPeriod;
        this.rotationPeriod = rotationPeriod;
    }

    public String getName() {
        return name;
    }

    public int getNumSatellites() {
        return numSatellites;
    }

    public double getMass() {
        return mass;
    }

    public double getVolume() {
        return volume;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getDistanceToSun() {
        return distanceToSun;
    }

    public PlanetType getType() {
        return type;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public double getRotationPeriod() {
        return rotationPeriod;
    }

    public void print() {
        System.out.println("Name of the planet: " + name);
        System.out.println("Number of satellites: " + numSatellites);
        System.out.println("Mass (kg): " + mass);
        System.out.println("Volume (km³): " + volume);
        System.out.println("Diameter (km): " + diameter);
        System.out.println("Distance to the Sun (million km): " + distanceToSun);
        System.out.println("Planet type: " + type);
        System.out.println("Is it visible? " + isVisible);
        System.out.println("Orbital Period (years): " + orbitalPeriod);
        System.out.println("Rotation Period (days): " + rotationPeriod);
    }

    public double calculateDensity() {
        if (volume != 0) {
            return mass / volume;
        } else {
            return 0;
        }
    }

    public boolean isExterior() {
        double distanceToSunKm = distanceToSun * 1e6; 
        double distanceToSunUA = distanceToSunKm / 149597870;
        return distanceToSunUA > 3.4;
    }

}