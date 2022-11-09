package Task5;

public class ConverterTemperature {
    int celsius;
    double fahrenheit;
    double kelvin;

    public ConverterTemperature(int celsius) {
        this.celsius = celsius;
    }

    void convert(int celsius) {
        this.fahrenheit = (9.0/5.0) * celsius + 32;
        this.kelvin = celsius + 273.15;
        System.out.println("Temperature in Fahrenheit is : " + fahrenheit);
        System.out.println("Temperature in Kelvin is : " + kelvin);
    }

}
