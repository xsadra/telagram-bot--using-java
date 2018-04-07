package de.sadrab.telagrambotusingjava.controller;

import de.sadrab.telagrambotusingjava.persistence.model.Message;
import de.sadrab.telagrambotusingjava.persistence.model.Methods;
import de.sadrab.telagrambotusingjava.persistence.model.Url;
import org.springframework.http.ResponseEntity;
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

    public String send(Message message){
        String urlAction = url.get(Methods.sendMessage);

        ResponseEntity<String> response = restTemplate.postForEntity(urlAction, message, String.class);
        System.out.println("Response : " +response.getBody());
        return response.getBody();
    }
}
