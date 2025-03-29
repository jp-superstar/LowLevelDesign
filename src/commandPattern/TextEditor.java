package commandPattern;

public class TextEditor {
    private String content = "";

    public void typeContent(String typeContent){
        content += typeContent;
        System.out.println(content);
    }

    public void deleteContent(int numberCharDelete){
        if(numberCharDelete <= content.length()){
            content = content.substring(0, content.length() - numberCharDelete);
        }
        else {
            content = "";
            System.out.println("Empty String");
        }
        System.out.println(content);
    }

    public String getContent() {
        return content;
    }


}
