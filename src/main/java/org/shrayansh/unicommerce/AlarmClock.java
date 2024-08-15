package org.shrayansh.unicommerce;

import java.util.*;

public class AlarmClock {

    private Queue<Message> queue;

    public AlarmClock() {
        queue = new LinkedList<>();
    }

    public void readMsg(Message msg){
        queue.add(msg);
    }

    public void processMsg(){
        List<Message> messageList=new ArrayList<>();
        while (!queue.isEmpty()){
            messageList.add(queue.poll());
        }

        Collections.sort(messageList);

        for(int i=0;i< messageList.size();i++){
            System.out.println(messageList.get(i));
        }

    }

}
