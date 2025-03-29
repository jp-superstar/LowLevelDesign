package strategyPattern;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        TextEditor tEditor1 = new TextEditor(new UpperCase());
        String s = tEditor1.formatting("abc");
        System.out.println(s);
    }
}