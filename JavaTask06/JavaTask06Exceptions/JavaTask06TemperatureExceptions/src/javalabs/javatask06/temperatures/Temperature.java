package javalabs.javatask06.temperatures;

public class Temperature {
    private double degrees;
    private Scale scale;

    public Temperature() {
        this(0.0, Scale.CELSIUS);
    }

    public Temperature(double degrees, Scale scale) {
        checkValidate(degrees, scale);
        this.degrees = degrees;
        this.scale = scale;
    }

    public double getDegrees() {
        return degrees;
    }

    public void setDegrees(double degrees) {
        checkValidate(degrees, scale);
        this.degrees = degrees;
    }
    public Scale getScale() {
        return scale;
    }

    public void setScale(Scale scale) {
        if (scale == this.scale)
            return;
        if (scale == Scale.FAREHEIGHT) {
            TemperatureCalculator.temperatureFromFahrenheitCelsius(this);
        }
        if (scale == Scale.CELSIUS) {
            TemperatureCalculator.temperatureFromCelsiusToFahrenheit(this);
        }
    }

    private void checkValidate(double degrees, Scale scale) {
        if ((scale == Scale.CELSIUS && degrees < -273.15) ||
                (scale == Scale.FAREHEIGHT && degrees < -459.67)) {
            throw new IllegalArgumentException("Degrees can not be lower of absolut zero!");
        }
    }
}
