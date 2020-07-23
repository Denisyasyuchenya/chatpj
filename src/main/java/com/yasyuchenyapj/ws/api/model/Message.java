package com.yasyuchenyapj.ws.api.model;

public class Message {
    private String content;
    private String senderName;
    private MesType type;

public enum MesType{
    CHAT,ONLINE,OFFLINE
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public MesType getType() {
        return type;
    }

    public void setType(MesType type) {
        this.type = type;
    }
}
