package javalabs.javatask04.temperature;

public class TemperatureMain {
    public static void main(String[] args) {
        Temperature test1 = new Temperature();
        TemperatureCalculator testCalc = new TemperatureCalculator();
        Temperature test01 = testCalc.temperatureFromCelsiusToFahrenheit(test1);
        System.out.printf("1." + test1.getScale().toString() + ": " + test1.getDegrees() + " ");
        System.out.println(test01.getScale().toString() + ": " + test01.getDegrees());

        test1.setDegrees(144.34);
        Temperature test02 = testCalc.temperatureFromCelsiusToFahrenheit(test1);
        System.out.printf("2." + test1.getScale().toString() + ": " + test1.getDegrees() + " ");
        System.out.println(test02.getScale().toString() + ": " + test02.getDegrees());

        test1.setScale(Scale.FAREHEIGHT);
        test1.setDegrees(291.8);
        Temperature test03 = testCalc.temperatureFromFahrenheitCelsius(test1);
        System.out.printf("3." + test1.getScale().toString() + ": " + test1.getDegrees() + " ");
        System.out.println(test03.getScale().toString() + ": " + test03.getDegrees());
    }
}
