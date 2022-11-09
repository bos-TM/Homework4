package Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in degree Celsius: ");
        int degreeCelsius = scanner.nextInt();
        ConverterTemperature converter = new ConverterTemperature(degreeCelsius);
        converter.convert(degreeCelsius);
    }
}
