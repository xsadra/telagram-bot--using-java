package de.sadrab.telagrambotusingjava.controller;

import de.sadrab.telagrambotusingjava.persistence.model.Message;
import de.sadrab.telagrambotusingjava.persistence.model.Methods;
import de.sadrab.telagrambotusingjava.persistence.model.Url;
import org.springframework.web.client.RestTemplate;

public class SendMessage {

    private RestTemplate restTemplate;

    private Message message;

    private Url url;

    public SendMessage() {
    }

    public SendMessage(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public SendMessage(RestTemplate restTemplate, Message message, Url url) {
        this.restTemplate = restTemplate;
        this.message = message;
        this.url = url;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String send(){
        String urlAction = url.get(Methods.sendMessage);
        Message send_message = null;
        send_message.setChat(message.getChat());
        send_message.setMessage_id(message.getFrom().getId());
        send_message.setText("Answer: "+message.getText());
        restTemplate.postForEntity(urlAction,send_message,String.class);
        return null;
    }
}
