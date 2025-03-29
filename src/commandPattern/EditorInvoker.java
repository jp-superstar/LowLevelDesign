package commandPattern;
import java.util.Stack;

public class EditorInvoker {

    Command command;
    static Stack<Command>previousCommandList = new Stack<>();
    public void setCommand(Command command) {
        this.command = command;
    }
    public void executeCommand(){
        command.execute();
        previousCommandList.push(command);
    }
    public void undoPreviousExecution(){
        if(previousCommandList.size() > 0){
            Command previousCommand = previousCommandList.pop();
            previousCommand.undo();
        }
        else System.out.println("No More PreviousCommand");
    }

}
