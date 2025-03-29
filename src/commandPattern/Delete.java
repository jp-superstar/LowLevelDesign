package commandPattern;

public class Delete implements Command{
    private TextEditor textEditor;
    private int deleteChars;
    private String deletedContent = "";
    public Delete(TextEditor textEditor, int deleteChars){
        this.deleteChars = deleteChars;
        this.textEditor = textEditor;
    }
    public void execute(){
        deletedContent = textEditor.getContent().substring(textEditor.getContent().length() - deleteChars );
        textEditor.deleteContent(deleteChars);
    }
    public void undo(){
        textEditor.typeContent(deletedContent);
    }

}
