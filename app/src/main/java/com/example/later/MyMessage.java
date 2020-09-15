package com.example.later;

import java.io.Serializable;

public class MyMessage implements Serializable {

    public int id=0;
    boolean sender=false;
    public String msg="";

    public MyMessage() {

    }

    public MyMessage(String msg, String from, String to, Type type) {
        this.msg = msg;
        this.from = from;
        this.to = to;
        this.type = type;
    }

    boolean isSender()
    {
        return sender;
    }
    public enum Type {
        CHAT,
        RECIEVED_SERVER,
        RECIEVED_USER,
        UID,
        EXIT
    }

    public String from,to,other;
    public Type type;

}
