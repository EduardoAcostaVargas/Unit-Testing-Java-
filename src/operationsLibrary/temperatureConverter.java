package operationsLibrary;

public class temperatureConverter {

    //Converts Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    //Converts Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
}
