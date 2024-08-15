package org.shrayansh.mementodesignpattern;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
    List<ConfigurationMemento> history = new ArrayList<>();

    public void addMemento(ConfigurationMemento memento){
        history.add(memento);
    }

    public ConfigurationMemento undo(){
        if(!history.isEmpty()){
            int mementoIndexToBeRemoved = history.size()-1;

            //get the memento to be removed
            ConfigurationMemento mementoToBeRemoved = history.get(mementoIndexToBeRemoved);

            //removing the last memento
            history.remove(mementoToBeRemoved);

            return mementoToBeRemoved;
        }
        return null;
    }
}
