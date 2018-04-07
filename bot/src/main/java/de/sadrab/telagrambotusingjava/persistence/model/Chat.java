package de.sadrab.telagrambotusingjava.persistence.model;

import org.springframework.lang.Nullable;

public class Chat {
    private Integer id;

    private String type;
    @Nullable
    private String title;
    @Nullable
    private String username;
    public Chat() {
    }

    public Chat(Integer id, String type) {
        this.id = id;
        this.type = type;
    }

    public Chat(Integer id, String type, String username) {
        this.id = id;
        this.type = type;
        this.username = username;
    }

    public Chat(Integer id, String type, String title, String username) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
