package observerPattern;

public class WindowDisplay implements Display {
    public void update(float temperature){
        System.out.println("WindowDisplay: Temperature updated to : " + temperature);
    }
}
