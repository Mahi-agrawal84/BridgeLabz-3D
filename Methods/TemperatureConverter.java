package Methods;
public class TemperatureConverter{
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        double celsius = 37;
        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.println(celsius + "°C = " + fahrenheit + "°F");
    }
}