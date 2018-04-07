package de.sadrab.telagrambotusingjava.persistence.model;

import java.util.List;

public class Message {

    private Integer message_id ; // Unique message identifier inside this chat
    private User from; // Optional. Sender, empty for messages sent to channels
    private Integer date; // Date the message was sent in Unix time
    private Chat chat; // Conversation the message belongs to
    private String text; // String // Optional.
    List<MessageEntity> entities; // Array of MessageEntity // Optional.
}
