package de.sadrab.telagrambotusingjava.controller;

import de.sadrab.telagrambotusingjava.persistence.model.Message;

public class SendMessage {
    private Message message;

    public SendMessage(Message message) {
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
