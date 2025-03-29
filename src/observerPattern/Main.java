package observerPattern;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStationMain = new WeatherStation();
        Display display1 = new PhoneDisplay();
        Display display2 = new WindowDisplay();
        weatherStationMain.addDisplay(display1);
        weatherStationMain.addDisplay(display2);
        weatherStationMain.setTemperature(50);
        weatherStationMain.removeDisplay(display2);
        weatherStationMain.setTemperature(55);
    }
}