package javalabs.javatask04.temperature;

public class Temperature {
    private double degrees;
    private Scale scale;

    public Temperature() {
        this(0.0, Scale.CELSIUS);
    }

    public Temperature(double degrees, Scale scale) {
        this.degrees = degrees;
        this.scale = scale;
    }

    public double getDegrees() {
        return degrees;
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }

    public Scale getScale() {
        return scale;
    }

    public void setScale(Scale scale) {
        this.scale = scale;
    }
}
