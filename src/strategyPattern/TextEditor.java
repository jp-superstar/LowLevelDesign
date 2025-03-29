package strategyPattern;

public class TextEditor {

    TextFormatter formatter;
    String input;
    public TextEditor(TextFormatter formatter){
        this.formatter = formatter;
    }
    public void setFormatter(TextFormatter formatter) {
        this.formatter = formatter;
    }
    public String getInput() {
        return input;
    }
    public void setInput(String input) {
        this.input = input;
    }
    public String formatting(String input){
        return formatter.format(input);
    }
}
