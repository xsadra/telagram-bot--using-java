package de.sadrab.telagrambotusingjava.persistence.model;

public class MessageEntity {
    private String type; //	Type of the entity.

    private Integer offset; // Offset in UTF-16 code units to the start of the entity
    private Integer length; //ngth of the entity in UTF-16 code units

    public MessageEntity() {
    }

    public MessageEntity(String type, Integer offset, Integer length) {
        this.type = type;
        this.offset = offset;
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "MessageEntity{" +
                "type='" + type + '\'' +
                ", offset=" + offset +
                ", length=" + length +
                '}';
    }
}
