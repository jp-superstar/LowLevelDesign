package strategyPattern;

public class LowerCase implements TextFormatter{

    public String format(String input){
        return input.toLowerCase();
    }
}
