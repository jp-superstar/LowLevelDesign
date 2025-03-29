package observerPattern;
import java.util.*;
public class WeatherStation {
    List<Display> names = new ArrayList<Display>();
    float temperature;
    public void addDisplay(Display displayName){
        names.add(displayName);
    }

    public void removeDisplay(Display displayName){
        names.remove(displayName);
    }

    public void setTemperature(float temp){
        temperature = temp;
        notify(temp);
    }
    private void notify(float temp){
        for(Display displays : names){
            displays.update(temp);
        }
    }


}
