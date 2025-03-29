package commandPattern;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        EditorInvoker editorInvoker = new EditorInvoker();
        Command typeHello = new Typing(textEditor, "ILoveYou");
        editorInvoker.setCommand(typeHello);
        editorInvoker.executeCommand();
        Command breakUp = new Delete(textEditor, 3);
        editorInvoker.setCommand(breakUp);
        editorInvoker.executeCommand();
        editorInvoker.undoPreviousExecution();
        editorInvoker.undoPreviousExecution();
        editorInvoker.undoPreviousExecution();
    }
}