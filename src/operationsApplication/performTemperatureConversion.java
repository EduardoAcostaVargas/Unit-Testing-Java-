package operationsApplication;

import operationsLibrary.temperatureConverter;
import java.util.Scanner;

public class performTemperatureConversion {

    //Method to choose conversion type
    public static void temperatureConversion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------- TEMPERATURE CONVERTER ----------");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("Select an option (1 or 2): ");
        int option = scanner.nextInt();

        switch (option){
            case 1 : {
                System.out.println("Enter temperature in Celsius");
                double celsius = scanner.nextDouble();
                double fahrenheit = temperatureConverter.celsiusToFahrenheit(celsius);

                String roundedFahrenheit = String.format("%.2f", fahrenheit);

                System.out.println(celsius + " Celsius is " + " " + roundedFahrenheit + " in Fahrenheit.");
                break;
            }
            case 2 : {
                System.out.println("Enter temperature in Fahrenheit");
                double fahrenheit = scanner.nextDouble();
                double celsius = temperatureConverter.fahrenheitToCelsius(fahrenheit);

                String roundedCelsius = String.format("%.2f", celsius);

                System.out.println(fahrenheit + " Fahrenheit is " + " " + roundedCelsius + " in Fahrenheit.");
                break;
            }
            default:{
                System.out.println("invalid choice. Please enter 1 or 2.");
            }

        }

    }
}
