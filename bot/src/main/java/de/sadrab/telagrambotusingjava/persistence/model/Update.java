package de.sadrab.telagrambotusingjava.persistence.model;

import javax.persistence.Id;

public class Update {
    private Integer update_id;
    private Message message;

    public Update() {
    }

    public Update(Integer update_id, Message message) {
        this.update_id = update_id;
        this.message = message;
    }

    public Integer getUpdate_id() {
        return update_id;
    }

    public void setUpdate_id(Integer update_id) {
        this.update_id = update_id;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Update{" +
                "update_id=" + update_id +
                ", message=" + message +
                '}';
    }
}
