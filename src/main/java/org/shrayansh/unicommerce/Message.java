package org.shrayansh.unicommerce;

import java.time.LocalDateTime;

class Message implements Comparable<Message>{
    String msg;
    LocalDateTime date;

    Message(String msg){
        this.msg=msg;
        this.date= LocalDateTime.now();
    }

    @Override
    public int compareTo(Message o) {
        if(this.date.isAfter(o.date))
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Message{" +
                "msg='" + msg + '\'' +
                ", date=" + date +
                '}';
    }
}
