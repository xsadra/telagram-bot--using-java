package de.sadrab.telagrambotusingjava.persistence.model;

public class MessageEntity {
    private String type; //	Type of the entity.
    private Integer offset; // Offset in UTF-16 code units to the start of the entity
    private Integer length; //ngth of the entity in UTF-16 code units
}
