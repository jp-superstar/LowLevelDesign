package commandPattern;

public class Typing implements Command {
    private TextEditor textEditor;
    private String insertInContent;
    public Typing(TextEditor textEditor, String insertInContent){
        this.insertInContent = insertInContent;
        this.textEditor = textEditor;
    }
    public void execute(){
        textEditor.typeContent(insertInContent);
    }

    public void undo(){
        textEditor.deleteContent(insertInContent.length());
    }
}
