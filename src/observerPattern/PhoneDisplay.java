package observerPattern;

public class PhoneDisplay implements Display{
    public void update(float temperature){
        System.out.println("PhoneDisplay: Temperature updated to : " + temperature);
    }
}
