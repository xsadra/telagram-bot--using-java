package de.sadrab.telagrambotusingjava.persistence.model;

public class MessageToSend {
    private Integer message_id;
    private Integer chat_id;
    private String text;

    public MessageToSend() {
    }

    public MessageToSend(Integer message_id, Integer chat_id, String text) {
        this.message_id = message_id;
        this.chat_id = chat_id;
        this.text = text;
    }

    public Integer getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Integer message_id) {
        this.message_id = message_id;
    }

    public Integer getChat_id() {
        return chat_id;
    }

    public void setChat_id(Integer chat_id) {
        this.chat_id = chat_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "MessageToSend{" +
                "message_id=" + message_id +
                ", chat_id=" + chat_id +
                ", text='" + text + '\'' +
                '}';
    }
}
