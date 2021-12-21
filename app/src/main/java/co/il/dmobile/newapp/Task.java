package co.il.dmobile.newapp;

import java.io.Serializable;

public class Task implements Serializable {

    private String title;
    private String description;
    public Boolean done = false;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Boolean isDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
