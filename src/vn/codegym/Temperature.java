package vn.codegym;

public class Temperature {
    private String celsiusLocalization;
    private String fahrenheitLocalization;

    public Temperature(String celsiusLocalization, String fahrenheitLocalization) {
        this.celsiusLocalization = celsiusLocalization;
        this.fahrenheitLocalization = fahrenheitLocalization;
    }

    public String getCelsiusLocalization() {
        return celsiusLocalization;
    }

    public void setCelsiusLocalization(String celsiusLocalization) {
        this.celsiusLocalization = celsiusLocalization;
    }

    public String getFahrenheitLocalization() {
        return fahrenheitLocalization;
    }

    public void setFahrenheitLocalization(String fahrenheitLocalization) {
        this.fahrenheitLocalization = fahrenheitLocalization;
    }

    public static double celsius2Fahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheit2Celsius(double fahrenheit) {
        return (fahrenheit - 32) * 9 / 5;
    }

}
