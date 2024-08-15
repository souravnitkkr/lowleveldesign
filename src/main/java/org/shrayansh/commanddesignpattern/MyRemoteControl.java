package org.shrayansh.commanddesignpattern;

import java.util.Stack;

//Invoke
public class MyRemoteControl {

    ICommand command;

    Stack<ICommand> iCommandStack=new Stack<>();

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        iCommandStack.push(command);
    }

    public void undoAction() {
        if(!iCommandStack.empty()){
            ICommand lastCommand = iCommandStack.pop();
            lastCommand.undo();
        }

    }
}
