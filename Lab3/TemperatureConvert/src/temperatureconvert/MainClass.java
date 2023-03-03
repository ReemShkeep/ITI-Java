package temperatureconvert;

public class MainClass {
    public static void main(String[] args) {
        float x = 24;
        System.out.println("Temperature = " + x + "C");
        System.out.println("Temperature = " + new TemperatureConvert().apply(x) + "F");
    }
}
