package de.sadrab.telagrambotusingjava.persistence.model;

public class Photo {
    private String file_id;
    private Integer width;
    private Integer height;

    public Photo() {
    }

    public Photo(String file_id, Integer width, Integer height) {
        this.file_id = file_id;
        this.width = width;
        this.height = height;
    }

    public String getFile_id() {
        return file_id;
    }

    public void setFile_id(String file_id) {
        this.file_id = file_id;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "file_id='" + file_id + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
