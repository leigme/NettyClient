package me.leig.i.nettyclient;

/**
 * Created by i on 2017/10/12.
 */

public class UnixData {

    private int userId;

    private int type;

    private String content;

    public UnixData(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public UnixData setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public int getType() {
        return type;
    }

    public UnixData setType(int type) {
        this.type = type;
        return this;
    }

    public String getContent() {
        return content;
    }

    public UnixData setContent(String content) {
        this.content = content;
        return this;
    }
}
