package javalabs.javatask06.temperatures;

public class TemperatureCalculator {
    public static Temperature temperatureFromCelsiusToFahrenheit(Temperature temperatureInCelsius) {
        if (temperatureInCelsius.getScale() == Scale.FAREHEIGHT)
        {
            return temperatureInCelsius;
        }
        double degreesInFahr = (temperatureInCelsius.getDegrees() * 1.8) + 32.0;
        Temperature temperatureInFahrenheit = new Temperature(degreesInFahr, Scale.FAREHEIGHT);
        return  temperatureInFahrenheit;
    }

    public static Temperature temperatureFromFahrenheitCelsius(Temperature temperatureInFahrenheit) {
        if (temperatureInFahrenheit.getScale() == Scale.CELSIUS)
        {
            return temperatureInFahrenheit;
        }
        double degreesInCels = (temperatureInFahrenheit.getDegrees() - 32.0) / 1.8;
        Temperature temperatureInCelsius = new Temperature(degreesInCels, Scale.CELSIUS);
        return  temperatureInCelsius;
    }
}
