package de.sadrab.telagrambotusingjava.persistence.model;

import java.util.List;

public class Message {
    private Integer message_id; // Unique message identifier inside this chat

    private User from; // Optional. Sender, empty for messages sent to channels
    private Integer date; // Date the message was sent in Unix time
    private Chat chat; // Conversation the message belongs to
    private String text; // String // Optional.
    private List<MessageEntity> entities; // Array of MessageEntity // Optional.
    public Message() {
    }

    public Message(Integer message_id, User from, Integer date, Chat chat) {
        this.message_id = message_id;
        this.from = from;
        this.date = date;
        this.chat = chat;
    }

    public Message(Integer message_id, User from, Integer date, Chat chat, String text) {
        this.message_id = message_id;
        this.from = from;
        this.date = date;
        this.chat = chat;
        this.text = text;
    }

    public Message(Integer message_id, User from, Integer date, Chat chat, String text, List<MessageEntity> entities) {
        this.message_id = message_id;
        this.from = from;
        this.date = date;
        this.chat = chat;
        this.text = text;
        this.entities = entities;
    }

    public Integer getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Integer message_id) {
        this.message_id = message_id;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<MessageEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<MessageEntity> entities) {
        this.entities = entities;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message_id=" + message_id +
                ", from=" + from +
                ", date=" + date +
                ", chat=" + chat +
                ", text='" + text + '\'' +
                ", entities=" + entities +
                '}';
    }
}
