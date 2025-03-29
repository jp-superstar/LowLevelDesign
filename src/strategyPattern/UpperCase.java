package strategyPattern;

public class UpperCase implements TextFormatter{
    public String format(String input) {
        String upper = input.toUpperCase();
        return upper;
    }
}
