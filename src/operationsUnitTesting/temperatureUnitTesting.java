package operationsUnitTesting;

import operationsLibrary.temperatureConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class temperatureUnitTesting {

    // tolerance between expected value and actual value
    private static final double DELTA = 0.001;


    // Celsius to Fahrenheit Tests
    @Test
    public void test1() {
        double celsius = 0;
        double result = temperatureConverter.celsiusToFahrenheit(celsius);

        assertEquals(32.0, result, DELTA);
    }

    @Test
    public void test2() {
        double celsius = 100.0;
        double result = temperatureConverter.celsiusToFahrenheit(celsius);

        assertEquals(212.0, result, DELTA);
    }

    @Test
    public void test3() {
        double celsius = 37;
        double result = temperatureConverter.celsiusToFahrenheit(celsius);

        assertEquals(98.6, result, DELTA);
    }

    //Fahrenheit to Celsius Tests
    @Test
    public void test4() {
        double fahrenheit = 98.6;
        double result = temperatureConverter.fahrenheitToCelsius(fahrenheit);

        assertEquals(37, result, DELTA);
    }

    @Test
    public void test5() {
        double fahrenheit = 212;
        double result = temperatureConverter.fahrenheitToCelsius(fahrenheit);

        assertEquals(100, result, DELTA);
    }

    @Test
    public void test6() {
        double fahrenheit = 32;
        double result = temperatureConverter.fahrenheitToCelsius(fahrenheit);

        assertEquals(0, result, DELTA);
    }


}
