package dev.diego;

import dev.diego.enums.PlanetType;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PlanetTest {

    @Test
    public void testCalculateDensity() {
        Planet earth = new Planet("Earth", 1, 5.972e24, 1.08321e12, 12742, 149, PlanetType.TERRESTRIAL, true, 1, 1);
        double expectedDensity = 5.972e24 / 1.08321e12;
        assertEquals(expectedDensity, earth.calculateDensity(), 1e-6, "Density calculation should be correct");
    }

    @Test
    public void testIsExterior() {
        Planet earth = new Planet("Earth", 1, 5.972e24, 1.08321e12, 12742, 149, PlanetType.TERRESTRIAL, true, 1, 1);
        assertFalse(earth.isExterior(), "Earth should not be an exterior planet");

        Planet jupiter = new Planet("Jupiter", 79, 1.898e27, 1.43128e15, 139820, 778, PlanetType.GASEOUS, true, 11.86, 0.41);
        assertTrue(jupiter.isExterior(), "Jupiter should be an exterior planet");
    }

    @Test
    public void testPlanetAttributes() {
        Planet mars = new Planet("Mars", 2, 6.4171e23, 1.6318e11, 6779, 228, PlanetType.TERRESTRIAL, false, 1.88, 1.03);

        assertEquals("Mars", mars.getName());
        assertEquals(2, mars.getNumSatellites());
        assertEquals(6.4171e23, mars.getMass());
        assertEquals(1.6318e11, mars.getVolume());
        assertEquals(6779, mars.getDiameter());
        assertEquals(228, mars.getDistanceToSun());
        assertEquals(PlanetType.TERRESTRIAL, mars.getType());
        assertFalse(mars.isVisible());
        assertEquals(1.88, mars.getOrbitalPeriod());
        assertEquals(1.03, mars.getRotationPeriod());
    }

    @Test
    public void testDifferentPlanetTypes() {
        Planet earth = new Planet("Earth", 1, 5.972e24, 1.08321e12, 12742, 149, PlanetType.TERRESTRIAL, true, 1, 1);
        Planet pluto = new Planet("Pluto", 5, 1.303e22, 6.39e9, 2376, 5906, PlanetType.DWARF, false, 248, 6.39);

        assertEquals(PlanetType.TERRESTRIAL, earth.getType());
        assertEquals(PlanetType.DWARF, pluto.getType());
    }

    @Test
    public void testPlanetWithoutSatellites() {
        Planet mercury = new Planet("Mercury", 0, 3.3011e23, 6.083e10, 4879, 58, PlanetType.TERRESTRIAL, false, 0.24, 58.6);

        assertEquals(0, mercury.getNumSatellites());
    }

    @Test
    public void testVisibleAndInvisiblePlanets() {
        Planet venus = new Planet("Venus", 0, 4.8675e24, 9.2843e11, 12104, 108, PlanetType.TERRESTRIAL, true, 0.62, 243);
        Planet neptune = new Planet("Neptune", 14, 1.024e26, 6.254e13, 49528, 4503, PlanetType.GASEOUS, false, 164.8, 0.67);

        assertTrue(venus.isVisible());
        assertFalse(neptune.isVisible());
    }

    @Test
    public void testZeroVolumeDensity() {
        Planet hypothetical = new Planet("Hypothetical", 0, 5.972e24, 0, 12742, 149, PlanetType.TERRESTRIAL, false, 1, 1);

        assertEquals(0, hypothetical.calculateDensity(), "Density should be 0 when volume is 0");
    }

    @Test
    public void testPrint() {
        Planet earth = new Planet("Earth", 1, 5.972e24, 1.08321e12, 12742, 149, PlanetType.TERRESTRIAL, true, 1, 1);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        earth.print();

        String expectedOutput = 
            "Name of the planet: Earth\n" +
            "Number of satellites: 1\n" +
            "Mass (kg): 5.972E24\n" +
            "Volume (km³): 1.08321E12\n" +
            "Diameter (km): 12742\n" +
            "Distance to the Sun (million km): 149\n" +
            "Planet type: TERRESTRIAL\n" +
            "Is it visible? true\n" +
            "Orbital Period (years): 1.0\n" +
            "Rotation Period (days): 1.0\n";

        assertEquals(expectedOutput.replaceAll("\\r?\\n", "\n"), outContent.toString().replaceAll("\\r?\\n", "\n"), "Print output should be correct");

        System.setOut(originalOut);
    }

    @Test
    public void testNegativeValues() {
        Planet negativePlanet = new Planet("Negative", -1, -5.972e24, -1.08321e12, -12742, -149, PlanetType.TERRESTRIAL, false, -1, -1);

        assertEquals("Negative", negativePlanet.getName());
        assertEquals(-1, negativePlanet.getNumSatellites());
        assertEquals(-5.972e24, negativePlanet.getMass());
        assertEquals(-1.08321e12, negativePlanet.getVolume());
        assertEquals(-12742, negativePlanet.getDiameter());
        assertEquals(-149, negativePlanet.getDistanceToSun());
        assertEquals(PlanetType.TERRESTRIAL, negativePlanet.getType());
        assertFalse(negativePlanet.isVisible());
        assertEquals(-1, negativePlanet.getOrbitalPeriod());
        assertEquals(-1, negativePlanet.getRotationPeriod());
    }

    @Test
    public void testZeroValues() {
        Planet zeroPlanet = new Planet("Zero", 0, 0, 0, 0, 0, PlanetType.TERRESTRIAL, false, 0, 0);

        assertEquals("Zero", zeroPlanet.getName());
        assertEquals(0, zeroPlanet.getNumSatellites());
        assertEquals(0, zeroPlanet.getMass());
        assertEquals(0, zeroPlanet.getVolume());
        assertEquals(0, zeroPlanet.getDiameter());
        assertEquals(0, zeroPlanet.getDistanceToSun());
        assertEquals(PlanetType.TERRESTRIAL, zeroPlanet.getType());
        assertFalse(zeroPlanet.isVisible());
        assertEquals(0, zeroPlanet.getOrbitalPeriod());
        assertEquals(0, zeroPlanet.getRotationPeriod());
        assertEquals(0, zeroPlanet.calculateDensity(), "Density should be 0 when mass and volume are 0");
    }

    @Test
    public void testOrbitalPeriod() {
        Planet mars = new Planet("Mars", 2, 6.4171e23, 1.6318e11, 6779, 228, PlanetType.TERRESTRIAL, false, 1.88, 1.03);
        assertEquals(1.88, mars.getOrbitalPeriod());
    }

    @Test
    public void testRotationPeriod() {
        Planet mars = new Planet("Mars", 2, 6.4171e23, 1.6318e11, 6779, 228, PlanetType.TERRESTRIAL, false, 1.88, 1.03);
        assertEquals(1.03, mars.getRotationPeriod());
    }
}